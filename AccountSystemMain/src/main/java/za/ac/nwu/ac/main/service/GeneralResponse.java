package za.ac.nwu.ac.main.service;

public class GeneralResponse<S> {
    private final boolean successful;
    //private final transient S payload;
    private final String payload;



    public GeneralResponse(boolean successful, S payload)
    {
        this.successful = true;
        System.out.println("/n");
        this.payload = "No Types Found";

    }

    public boolean getSuccessful() {
        return successful;
    }
    public String getPayload() {
        return payload;
    }
}
