import { useNavigate } from "react-router-dom";
import { EmptyState } from "../components/States";
import { BrandButton } from "../components/Button";

export function NotFound() {
  const navigate = useNavigate();

  return (
    <div>
      <EmptyState title="This page is not here" hint="The link may be old, or the anime may have been taken down." />
      <div style={{ display: "grid", placeItems: "center" }}>
        <BrandButton onClick={() => navigate("/")}>Back to home</BrandButton>
      </div>
    </div>
  );
}
