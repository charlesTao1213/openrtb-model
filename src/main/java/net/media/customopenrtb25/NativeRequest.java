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

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Map;

public class NativeRequest {
    private String ver = Native.DEFAULT_NATIVE_VERSION;

    private Integer layout;

    private Integer adunit;

    private Integer context;

    private Integer contextsubtype;

    private Integer plcmttype;

    private Integer plcmtcnt;

    private Integer seq;

    @NotEmpty
    @Valid
    private List<Asset> assets;

    private Map<String, Object> ext;


    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public Integer getLayout() {
        return layout;
    }

    public void setLayout(Integer layout) {
        this.layout = layout;
    }

    public Integer getAdunit() {
        return adunit;
    }

    public void setAdunit(Integer adunit) {
        this.adunit = adunit;
    }

    public Integer getContext() {
        return context;
    }

    public void setContext(Integer context) {
        this.context = context;
    }

    public Integer getContextsubtype() {
        return contextsubtype;
    }

    public void setContextsubtype(Integer contextsubtype) {
        this.contextsubtype = contextsubtype;
    }

    public Integer getPlcmttype() {
        return plcmttype;
    }

    public void setPlcmttype(Integer plcmttype) {
        this.plcmttype = plcmttype;
    }

    public Integer getPlcmtcnt() {
        return plcmtcnt;
    }

    public void setPlcmtcnt(Integer plcmtcnt) {
        this.plcmtcnt = plcmtcnt;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }
}
