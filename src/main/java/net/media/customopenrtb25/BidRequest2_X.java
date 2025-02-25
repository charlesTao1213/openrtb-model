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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import net.media.utils.validator.CheckExactlyOneWithExt;

import java.util.List;
import java.util.Map;
import java.util.Objects;



@CheckExactlyOneWithExt(fieldNames = {"site", "app"}, extFieldNames = {"dooh"})
public class BidRequest2_X {

    // BidRequest2_X parameters
    public static final Integer DEFAULT_ALL_IMPS = 0;

    @NotBlank
    private String id;

    @NotEmpty
    @Valid
    private List<Imp> imp;

    private Site site;

    private App app;

    private Device device;

    @Valid
    private User user;

    private List<String> badv;

    private Integer at;

    private Integer test;

    private List<String> wseat;

    private List<String> bseat;

    private Integer tmax;

    @Valid
    private Source source;

    private List<String> bcat;

    private Integer allimps = DEFAULT_ALL_IMPS;

    private List<String> cur;

    private List<String> wlang;

    private List<String> bapp;

    private Regs regs;

    private Map<String, Object> ext;

    private transient Integer gdpr;

    private transient Integer gdprconsent;

    private transient String gdprstring;

    private transient String googleConsents;

    public BidRequest2_X(BidRequest2_X bidRequest) {
        this.id = bidRequest.id;
        this.imp = null;
        this.site = bidRequest.site;
        this.app = bidRequest.app;
        this.device = bidRequest.device;
        this.user = bidRequest.user;
        this.badv = bidRequest.badv;
        this.at = bidRequest.at;
        this.test = bidRequest.test;
        this.wseat = bidRequest.wseat;
        this.tmax = bidRequest.tmax;
        this.bcat = bidRequest.bcat;
        this.allimps = bidRequest.allimps;
        this.cur = bidRequest.cur;
        this.bapp = bidRequest.bapp;
        this.regs = bidRequest.regs;
        this.ext = bidRequest.ext;
    }

    public BidRequest2_X() {
    }

    public @NotEmpty String getId() {
        return this.id;
    }

    public void setId(@NotEmpty String id) {
        this.id = id;
    }

    public @NotEmpty
    @Valid List<Imp> getImp() {
        return this.imp;
    }

    public void setImp(@NotEmpty @Valid List<Imp> imp) {
        this.imp = imp;
    }

    public @Valid Site getSite() {
        return this.site;
    }

    public void setSite(@Valid Site site) {
        this.site = site;
    }

    public @Valid App getApp() {
        return this.app;
    }

    public void setApp(@Valid App app) {
        this.app = app;
    }

    public Device getDevice() {
        return this.device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public @Valid User getUser() {
        return this.user;
    }

    public void setUser(@Valid User user) {
        this.user = user;
    }

    public List<String> getBadv() {
        return this.badv;
    }

    public void setBadv(List<String> badv) {
        this.badv = badv;
    }

    public Integer getAt() {
        return this.at;
    }

    public void setAt(Integer at) {
        this.at = at;
    }

    public Integer getTest() {
        return this.test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

    public List<String> getWseat() {
        return this.wseat;
    }

    public void setWseat(List<String> wseat) {
        this.wseat = wseat;
    }

    public List<String> getBseat() {
        return this.bseat;
    }

    public void setBseat(List<String> bseat) {
        this.bseat = bseat;
    }

    public Integer getTmax() {
        return this.tmax;
    }

    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    public @Valid Source getSource() {
        return this.source;
    }

    public void setSource(@Valid Source source) {
        this.source = source;
    }

    public List<String> getBcat() {
        return this.bcat;
    }

    public void setBcat(List<String> bcat) {
        this.bcat = bcat;
    }

    public Integer getAllimps() {
        return this.allimps;
    }

    public void setAllimps(Integer allimps) {
        this.allimps = allimps;
    }

    public List<String> getCur() {
        return this.cur;
    }

    public void setCur(List<String> cur) {
        this.cur = cur;
    }

    public List<String> getWlang() {
        return this.wlang;
    }

    public void setWlang(List<String> wlang) {
        this.wlang = wlang;
    }

    public List<String> getBapp() {
        return this.bapp;
    }

    public void setBapp(List<String> bapp) {
        this.bapp = bapp;
    }

    public Regs getRegs() {
        return this.regs;
    }

    public void setRegs(Regs regs) {
        this.regs = regs;
    }

    public Map<String, Object> getExt() {
        return this.ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    public Integer getGdpr() {
        return this.gdpr;
    }

    public void setGdpr(Integer gdpr) {
        this.gdpr = gdpr;
    }

    public Integer getGdprconsent() {
        return this.gdprconsent;
    }

    public void setGdprconsent(Integer gdprconsent) {
        this.gdprconsent = gdprconsent;
    }

    public String getGdprstring() {
        return this.gdprstring;
    }

    public void setGdprstring(String gdprstring) {
        this.gdprstring = gdprstring;
    }

    public String getGoogleConsents() {
        return this.googleConsents;
    }

    public void setGoogleConsents(String googleConsents) {
        this.googleConsents = googleConsents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BidRequest2_X that = (BidRequest2_X) o;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getImp(), that.getImp())
                && Objects.equals(getSite(), that.getSite())
                && Objects.equals(getApp(), that.getApp())
                && Objects.equals(getDevice(), that.getDevice())
                && Objects.equals(getUser(), that.getUser())
                && Objects.equals(getBadv(), that.getBadv())
                && Objects.equals(getAt(), that.getAt())
                && Objects.equals(getTest(), that.getTest())
                && Objects.equals(getWseat(), that.getWseat())
                && Objects.equals(getBseat(), that.getBseat())
                && Objects.equals(getTmax(), that.getTmax())
                && Objects.equals(getSource(), that.getSource())
                && Objects.equals(getBcat(), that.getBcat())
                && Objects.equals(getAllimps(), that.getAllimps())
                && Objects.equals(getCur(), that.getCur())
                && Objects.equals(getWlang(), that.getWlang())
                && Objects.equals(getBapp(), that.getBapp())
                && Objects.equals(getRegs(), that.getRegs())
                && Objects.equals(getExt(), that.getExt())
                && Objects.equals(getGdpr(), that.getGdpr())
                && Objects.equals(getGdprconsent(), that.getGdprconsent())
                && Objects.equals(getGdprstring(), that.getGdprstring())
                && Objects.equals(getGoogleConsents(), that.getGoogleConsents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getImp(),
                getSite(),
                getApp(),
                getDevice(),
                getUser(),
                getBadv(),
                getAt(),
                getTest(),
                getWseat(),
                getBseat(),
                getTmax(),
                getSource(),
                getBcat(),
                getAllimps(),
                getCur(),
                getWlang(),
                getBapp(),
                getRegs(),
                getExt(),
                getGdpr(),
                getGdprconsent(),
                getGdprstring(),
                getGoogleConsents());
    }
}
