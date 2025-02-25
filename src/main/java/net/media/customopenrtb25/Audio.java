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

import jakarta.validation.constraints.NotEmpty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by rajat.go on 19/12/18.
 */
public class Audio {

    @NotEmpty
    private List<String> mimes;

    private Integer minduration;

    private Integer maxduration;

    private List<Integer> protocols;

    private Integer startdelay;

    private Integer sequence;

    private List<Integer> battr;

    private Integer maxextended;

    private Integer minbitrate;

    private Integer maxbitrate;

    private List<Integer> delivery;

    private List<Banner> companionad;

    private List<Integer> api;

    private List<Integer> companiontype;

    private Integer maxseq;

    private Integer feed;

    private Integer stitched;

    private Integer nvol;

    private Map<String, Object> ext;

    public @NotEmpty List<String> getMimes() {
        return this.mimes;
    }

    public void setMimes(@NotEmpty List<String> mimes) {
        this.mimes = mimes;
    }

    public Integer getMinduration() {
        return this.minduration;
    }

    public void setMinduration(Integer minduration) {
        this.minduration = minduration;
    }

    public Integer getMaxduration() {
        return this.maxduration;
    }

    public void setMaxduration(Integer maxduration) {
        this.maxduration = maxduration;
    }

    public List<Integer> getProtocols() {
        return this.protocols;
    }

    public void setProtocols(List<Integer> protocols) {
        this.protocols = protocols;
    }

    public Integer getStartdelay() {
        return this.startdelay;
    }

    public void setStartdelay(Integer startdelay) {
        this.startdelay = startdelay;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public List<Integer> getBattr() {
        return this.battr;
    }

    public void setBattr(List<Integer> battr) {
        this.battr = battr;
    }

    public Integer getMaxextended() {
        return this.maxextended;
    }

    public void setMaxextended(Integer maxextended) {
        this.maxextended = maxextended;
    }

    public Integer getMinbitrate() {
        return this.minbitrate;
    }

    public void setMinbitrate(Integer minbitrate) {
        this.minbitrate = minbitrate;
    }

    public Integer getMaxbitrate() {
        return this.maxbitrate;
    }

    public void setMaxbitrate(Integer maxbitrate) {
        this.maxbitrate = maxbitrate;
    }

    public List<Integer> getDelivery() {
        return this.delivery;
    }

    public void setDelivery(List<Integer> delivery) {
        this.delivery = delivery;
    }

    public List<Banner> getCompanionad() {
        return this.companionad;
    }

    public void setCompanionad(List<Banner> companionad) {
        this.companionad = companionad;
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public void setApi(List<Integer> api) {
        this.api = api;
    }

    public List<Integer> getCompaniontype() {
        return this.companiontype;
    }

    public void setCompaniontype(List<Integer> companiontype) {
        this.companiontype = companiontype;
    }

    public Integer getMaxseq() {
        return this.maxseq;
    }

    public void setMaxseq(Integer maxseq) {
        this.maxseq = maxseq;
    }

    public Integer getFeed() {
        return this.feed;
    }

    public void setFeed(Integer feed) {
        this.feed = feed;
    }

    public Integer getStitched() {
        return this.stitched;
    }

    public void setStitched(Integer stitched) {
        this.stitched = stitched;
    }

    public Integer getNvol() {
        return this.nvol;
    }

    public void setNvol(Integer nvol) {
        this.nvol = nvol;
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
        Audio audio = (Audio) o;
        return Objects.equals(getMimes(), audio.getMimes()) && Objects.equals(getMinduration(), audio.getMinduration()) && Objects.equals(getMaxduration(), audio.getMaxduration()) && Objects.equals(getProtocols(), audio.getProtocols()) && Objects.equals(getStartdelay(), audio.getStartdelay()) && Objects.equals(getSequence(), audio.getSequence()) && Objects.equals(getBattr(), audio.getBattr()) && Objects.equals(getMaxextended(), audio.getMaxextended()) && Objects.equals(getMinbitrate(), audio.getMinbitrate()) && Objects.equals(getMaxbitrate(), audio.getMaxbitrate()) && Objects.equals(getDelivery(), audio.getDelivery()) && Objects.equals(getCompanionad(), audio.getCompanionad()) && Objects.equals(getApi(), audio.getApi()) && Objects.equals(getCompaniontype(), audio.getCompaniontype()) && Objects.equals(getMaxseq(), audio.getMaxseq()) && Objects.equals(getFeed(), audio.getFeed()) && Objects.equals(getStitched(), audio.getStitched()) && Objects.equals(getNvol(), audio.getNvol()) && Objects.equals(getExt(), audio.getExt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMimes(), getMinduration(), getMaxduration(), getProtocols(), getStartdelay(), getSequence(), getBattr(), getMaxextended(), getMinbitrate(), getMaxbitrate(), getDelivery(), getCompanionad(), getApi(), getCompaniontype(), getMaxseq(), getFeed(), getStitched(), getNvol(), getExt());
    }
}
