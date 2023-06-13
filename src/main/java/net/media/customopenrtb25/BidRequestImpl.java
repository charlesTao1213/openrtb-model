package net.media.customopenrtb25;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

/**
 * @author Charles Tao
 * @version 1.0.0
 */

public class BidRequestImpl extends BidRequest2_X {

    @NotNull
    private String apiVersion;

    @NotNull
    private String channelId;

    @NotNull
    private String positionId;

    @NotNull
    private Short mode;

    @DecimalMin(value = "0.00", message = "adCount 必须大于0")
    private int adCount;


    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public Short getMode() {
        return mode;
    }

    public void setMode(Short mode) {
        this.mode = mode;
    }

    public int getAdCount() {
        return adCount;
    }

    public void setAdCount(int adCount) {
        this.adCount = adCount;
    }
}
