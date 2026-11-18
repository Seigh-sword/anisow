!include "MUI2.nsh"
!include "FileFunc.nsh"

; AniSpots — the Windows installer script.
;
; This is what makes the .exe a real installer rather than a self-extracting
; archive:
;
;   * one wizard, with the pages a person expects to see;
;   * a folder the person chooses, created for them;
;   * a Start-menu entry and a desktop shortcut;
;   * a working uninstaller.
;
; The install directory defaults to the per-user application data folder,
; `C:\Users\<you>\AppData\Roaming\anispot`, so the app and the data it
; keeps live in one place.

!define APPNAME "AniSpots"
!define APPVERSION "0.1.0"
!define APPPUBLISHER "AniSpots"

Name "${APPNAME} ${APPVERSION}"
OutFile "AniSpots-${APPVERSION}-x64-setup.exe"
Unicode true
InstallDir "$APPDATA\anispot"
InstallDirRegKey HKCU "Software\${APPNAME}" "InstallLocation"
RequestExecutionLevel user

VIProductVersion "${APPVERSION}.0"
VIAddVersionKey "ProductName" "${APPNAME}"
VIAddVersionKey "FileDescription" "${APPNAME} installer"
VIAddVersionKey "FileVersion" "${APPVERSION}.0"
VIAddVersionKey "ProductVersion" "${APPVERSION}.0"
VIAddVersionKey "CompanyName" "${APPPUBLISHER}"
VIAddVersionKey "LegalCopyright" "Copyright © ${APPPUBLISHER}"

!define MUI_ABORTWARNING
!define MUI_ICON "icon.ico"
!define MUI_UNICON "icon.ico"
!define MUI_FINISHPAGE_RUN "$INSTDIR\${APPNAME}.exe"
!define MUI_FINISHPAGE_RUN_TEXT "Start ${APPNAME}"

!insertmacro MUI_PAGE_WELCOME
!insertmacro MUI_PAGE_DIRECTORY
!insertmacro MUI_PAGE_INSTFILES
!insertmacro MUI_PAGE_FINISH

!insertmacro MUI_UNPAGE_CONFIRM
!insertmacro MUI_UNPAGE_INSTFILES

!insertmacro MUI_LANGUAGE "English"

Section "Install"
  SetOutPath "$INSTDIR"

  ; The application files. The installer writes every one of them into the
  ; folder it created, so the app is complete on disk.
  File /r "..\dist\win-unpacked\*.*"

  ; The uninstaller.
  WriteUninstaller "$INSTDIR\Uninstall ${APPNAME}.exe"

  ; The Start-menu entry.
  CreateDirectory "$SMPROGRAMS\${APPNAME}"
  CreateShortCut "$SMPROGRAMS\${APPNAME}\${APPNAME}.lnk" "$INSTDIR\${APPNAME}.exe"
  CreateShortCut "$SMPROGRAMS\${APPNAME}\Uninstall ${APPNAME}.lnk" "$INSTDIR\Uninstall ${APPNAME}.exe"

  ; The desktop shortcut.
  CreateShortCut "$DESKTOP\${APPNAME}.lnk" "$INSTDIR\${APPNAME}.exe"

  ; Remember where it went, so the next install or upgrade finds it.
  WriteRegStr HKCU "Software\${APPNAME}" "InstallLocation" "$INSTDIR"
  WriteRegStr HKCU "Software\${APPNAME}" "UninstallString" '"$INSTDIR\Uninstall ${APPNAME}.exe"'
  WriteRegStr HKCU "Software\${APPNAME}" "DisplayName" "${APPNAME}"
  WriteRegStr HKCU "Software\${APPNAME}" "DisplayVersion" "${APPVERSION}"
  WriteRegStr HKCU "Software\${APPNAME}" "Publisher" "${APPPUBLISHER}"
  WriteRegStr HKCU "Software\${APPNAME}" "InstallDate" "$(GetDate)"

  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "InstallLocation" "$INSTDIR"
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "UninstallString" '"$INSTDIR\Uninstall ${APPNAME}.exe"'
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "DisplayName" "${APPNAME}"
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "DisplayVersion" "${APPVERSION}"
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "Publisher" "${APPPUBLISHER}"
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "DisplayIcon" "$INSTDIR\${APPNAME}.exe"
  WriteRegStr HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "InstallDate" "$(GetDate)"
  WriteRegDWORD HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "NoModify" 1
  WriteRegDWORD HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}" "NoRepair" 1

  ; Tell the shell the shortcuts changed.
  System::Call 'shell32::SHChangeNotify(i 0x08000000, i 0, i 0, i 0)'

SectionEnd

Section "Uninstall"
  ; The app's own data — downloads, the update cache — is left alone, because
  ; deleting someone's downloads without being asked is rude. It is removed
  ; only if the person asks for it here.
  ReadINIStr $0 "$INSTDIR\uninstall.ini" "Settings" "RemoveData"
  ${If} $0 == "1"
    RMDir /r "$INSTDIR"
  ${Else}
    Delete "$INSTDIR\Uninstall ${APPNAME}.exe"
    Delete "$INSTDIR\*.*"
    RMDir "$INSTDIR"
  ${EndIf}

  Delete "$SMPROGRAMS\${APPNAME}\${APPNAME}.lnk"
  Delete "$SMPROGRAMS\${APPNAME}\Uninstall ${APPNAME}.exe"
  RMDir "$SMPROGRAMS\${APPNAME}"
  Delete "$DESKTOP\${APPNAME}.lnk"

  DeleteRegKey HKCU "Software\Microsoft\Windows\CurrentVersion\Uninstall\${APPNAME}"
  DeleteRegKey HKCU "Software\${APPNAME}"

  System::Call 'shell32::SHChangeNotify(i 0x08000000, i 0, i 0, i 0)'
SectionEnd
