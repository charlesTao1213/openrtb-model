/*
 * Copyright  2019 - present. IAB Tech Lab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.media.customopenrtb25;

import com.alibaba.fastjson2.annotation.JSONField;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by vishnu on 6/5/16.
 */
public class Deal {

    private static final double DEFAULT_BIDFLOOR = 0.0;

    @NotBlank
    private String id;

    @JSONField(name = "bidfloor")
    private double bidFloor = DEFAULT_BIDFLOOR;

    @JSONField(name = "bidfloorcur")
    private String bidFloorCur;

    private Integer at;
    private List<String> wseat;
    private List<String> wadomain;
    private Map<String, Object> ext;

    public Deal() {
    }

    public String getBidFloorCur() {
        return bidFloorCur;
    }

    public void setBidFloorCur(String bidFloorCur) {
        this.bidFloorCur = bidFloorCur;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBidFloor() {
        return this.bidFloor;
    }

    public void setBidFloor(double bidFloor) {
        this.bidFloor = bidFloor;
    }

    public Integer getAt() {
        return this.at;
    }

    public void setAt(Integer at) {
        this.at = at;
    }

    public List<String> getWseat() {
        return this.wseat;
    }

    public void setWseat(List<String> wseat) {
        this.wseat = wseat;
    }

    public List<String> getWadomain() {
        return this.wadomain;
    }

    public void setWadomain(List<String> wadomain) {
        this.wadomain = wadomain;
    }

    public Map<String, Object> getExt() {
        return this.ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Double.compare(deal.getBidFloor(), getBidFloor()) == 0
                && Objects.equals(getId(), deal.getId())
                && Objects.equals(getBidFloorCur(), deal.getBidFloorCur())
                && Objects.equals(getAt(), deal.getAt())
                && Objects.equals(getWseat(), deal.getWseat())
                && Objects.equals(getWadomain(), deal.getWadomain())
                && Objects.equals(getExt(), deal.getExt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(), getBidFloor(), getBidFloorCur(), getAt(), getWseat(), getWadomain(), getExt());
    }
}
