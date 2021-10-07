package za.ac.nwu.ac.main.service;

import java.io.Serializable;
import java.util.Objects;

public class GeneralResponse<S>  implements Serializable {
    private final boolean successful;
    //private final transient S payload;
    private final String payload;


    public GeneralResponse(boolean successful, String payload) {
        this.successful = successful;
        this.payload = payload;
    }


    public boolean isSuccessful() {
        return successful;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneralResponse<?> that = (GeneralResponse<?>) o;
        return successful == that.successful && Objects.equals(payload, that.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successful, payload);
    }

    @Override
    public String toString() {
        return "GeneralResponse{" +
                "successful=" + successful +
                ", payload='" + payload + '\'' +
                '}';
    }
}
