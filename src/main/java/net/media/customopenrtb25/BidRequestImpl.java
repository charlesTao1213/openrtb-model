package net.media.customopenrtb25;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

/**
 * @author Charles Tao
 * @version 1.0.0
 */

@Data
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

}
