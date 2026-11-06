package com.xo.anilab.ui.notice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.xo.anilab.R
import com.xo.anilab.core.loadPoster
import com.xo.anilab.core.setVisible
import com.xo.anilab.databinding.BottomSheetMessageBinding

/**
 * A server-driven notice. The payload is passed as plain strings because the
 * sheet is recreated by the system and the model lives in the data layer.
 *
 * A forced message has no close button and cannot be dismissed by tapping
 * outside; anything else closes normally.
 */
class NoticeSheet : BottomSheetDialogFragment() {

    private var _binding: BottomSheetMessageBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = BottomSheetMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = requireArguments()

        val force = args.getBoolean(ARG_FORCE)
        val url = args.getString(ARG_URL)
        val action = args.getString(ARG_ACTION)
        val icon = args.getString(ARG_ICON)

        binding.title.text = args.getString(ARG_TITLE).orEmpty()
        binding.message.text = args.getString(ARG_MESSAGE).orEmpty()
        binding.message.setVisible(!args.getString(ARG_MESSAGE).isNullOrBlank())

        if (icon.isNullOrBlank()) {
            binding.icon.setImageResource(R.drawable.ic_info)
        } else {
            binding.icon.loadPoster(icon)
        }

        // A forced notice is the only way the app can insist; it loses the
        // close affordance and the dismiss-on-tap-outside behaviour.
        binding.closeIcon.setVisible(!force)
        binding.closeIcon.setOnClickListener { dismiss() }
        isCancelable = !force

        val hasAction = !action.isNullOrBlank() && !url.isNullOrBlank()
        binding.actionBtn.setVisible(hasAction)
        binding.actionBtn.text = action.orEmpty()
        binding.actionBtn.setOnClickListener {
            openUrl(url)
            dismiss()
        }
    }

    private fun openUrl(url: String?) {
        if (url.isNullOrBlank()) return
        runCatching { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url))) }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val TAG = "notice_sheet"
        private const val ARG_TITLE = "title"
        private const val ARG_MESSAGE = "message"
        private const val ARG_ICON = "icon"
        private const val ARG_URL = "url"
        private const val ARG_ACTION = "action"
        private const val ARG_FORCE = "force"

        fun newInstance(
            title: String?,
            message: String?,
            icon: String?,
            action: String?,
            url: String?,
            force: Boolean,
        ) = NoticeSheet().apply {
            arguments = Bundle().apply {
                putString(ARG_TITLE, title)
                putString(ARG_MESSAGE, message)
                putString(ARG_ICON, icon)
                putString(ARG_ACTION, action)
                putString(ARG_URL, url)
                putBoolean(ARG_FORCE, force)
            }
        }
    }
}
