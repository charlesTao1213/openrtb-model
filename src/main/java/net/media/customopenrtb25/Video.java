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

public class Video {

    @NotEmpty
    private List<String> mimes;

    private Integer minduration;

    private Integer maxduration;

    private List<Integer> protocols;

    private Integer w;

    private Integer h;

    private Integer startdelay;

    private Integer linearity;

    private Integer skip;

    private Integer placement;

    private Integer skipmin;

    private Integer skipafter;

    private Integer sequence;

    private List<Integer> battr;

    private Integer maxextended;

    private Integer minbitrate;

    private Integer maxbitrate;

    private Integer boxingallowed;

    private List<Integer> playbackmethod;

    private Integer playbackend;

    private List<Integer> delivery;

    private Integer pos;

    private List<Banner> companionad;

    private List<Integer> api;

    private List<Integer> companiontype;

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

    public Integer getW() {
        return this.w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getH() {
        return this.h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getStartdelay() {
        return this.startdelay;
    }

    public void setStartdelay(Integer startdelay) {
        this.startdelay = startdelay;
    }

    public Integer getLinearity() {
        return this.linearity;
    }

    public void setLinearity(Integer linearity) {
        this.linearity = linearity;
    }

    public Integer getSkip() {
        return this.skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public Integer getPlacement() {
        return this.placement;
    }

    public void setPlacement(Integer placement) {
        this.placement = placement;
    }

    public Integer getSkipmin() {
        return this.skipmin;
    }

    public void setSkipmin(Integer skipmin) {
        this.skipmin = skipmin;
    }

    public Integer getSkipafter() {
        return this.skipafter;
    }

    public void setSkipafter(Integer skipafter) {
        this.skipafter = skipafter;
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

    public Integer getBoxingallowed() {
        return this.boxingallowed;
    }

    public void setBoxingallowed(Integer boxingallowed) {
        this.boxingallowed = boxingallowed;
    }

    public List<Integer> getPlaybackmethod() {
        return this.playbackmethod;
    }

    public void setPlaybackmethod(List<Integer> playbackmethod) {
        this.playbackmethod = playbackmethod;
    }

    public Integer getPlaybackend() {
        return this.playbackend;
    }

    public void setPlaybackend(Integer playbackend) {
        this.playbackend = playbackend;
    }

    public List<Integer> getDelivery() {
        return this.delivery;
    }

    public void setDelivery(List<Integer> delivery) {
        this.delivery = delivery;
    }

    public Integer getPos() {
        return this.pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
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
        Video video = (Video) o;
        return Objects.equals(getMimes(), video.getMimes())
                && Objects.equals(getMinduration(), video.getMinduration())
                && Objects.equals(getMaxduration(), video.getMaxduration())
                && Objects.equals(getProtocols(), video.getProtocols())
                && Objects.equals(getW(), video.getW())
                && Objects.equals(getH(), video.getH())
                && Objects.equals(getStartdelay(), video.getStartdelay())
                && Objects.equals(getLinearity(), video.getLinearity())
                && Objects.equals(getSkip(), video.getSkip())
                && Objects.equals(getPlacement(), video.getPlacement())
                && Objects.equals(getSkipmin(), video.getSkipmin())
                && Objects.equals(getSkipafter(), video.getSkipafter())
                && Objects.equals(getSequence(), video.getSequence())
                && Objects.equals(getBattr(), video.getBattr())
                && Objects.equals(getMaxextended(), video.getMaxextended())
                && Objects.equals(getMinbitrate(), video.getMinbitrate())
                && Objects.equals(getMaxbitrate(), video.getMaxbitrate())
                && Objects.equals(getBoxingallowed(), video.getBoxingallowed())
                && Objects.equals(getPlaybackmethod(), video.getPlaybackmethod())
                && Objects.equals(getPlaybackend(), video.getPlaybackend())
                && Objects.equals(getDelivery(), video.getDelivery())
                && Objects.equals(getPos(), video.getPos())
                && Objects.equals(getCompanionad(), video.getCompanionad())
                && Objects.equals(getApi(), video.getApi())
                && Objects.equals(getCompaniontype(), video.getCompaniontype())
                && Objects.equals(getExt(), video.getExt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getMimes(),
                getMinduration(),
                getMaxduration(),
                getProtocols(),
                getW(),
                getH(),
                getStartdelay(),
                getLinearity(),
                getSkip(),
                getPlacement(),
                getSkipmin(),
                getSkipafter(),
                getSequence(),
                getBattr(),
                getMaxextended(),
                getMinbitrate(),
                getMaxbitrate(),
                getBoxingallowed(),
                getPlaybackmethod(),
                getPlaybackend(),
                getDelivery(),
                getPos(),
                getCompanionad(),
                getApi(),
                getCompaniontype(),
                getExt());
    }
}
