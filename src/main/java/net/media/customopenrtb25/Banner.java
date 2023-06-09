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

import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Created by vishnu on 6/5/16. */
public class Banner {

  private Integer w;

  private Integer h;

  private List<Format> format;

  private String id;

  private List<Integer> btype;

  private List<Integer> battr;

  private Integer pos;

  private List<String> mimes;

  private Integer topframe;

  private Integer wmax;

  private Integer wmin;

  private Integer hmax;

  private Integer hmin;

  private List<Integer> expdir;

  private List<Integer> api;

  private Integer vcm;

  private Map<String, Object> ext;

  public Banner(Banner banner) {
    this.id = banner.id;
    this.w = banner.w;
    this.h = banner.h;
    this.format = banner.format;
    this.btype = banner.btype;
    this.battr = banner.battr;
    this.pos = banner.pos;
    this.mimes = banner.mimes;
    this.topframe = banner.topframe;
    this.expdir = banner.expdir;
    this.api = banner.api;
    this.ext = banner.ext;
  }

  public Banner() {}

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

  public List<Format> getFormat() {
    return this.format;
  }

  public void setFormat(List<Format> format) {
    this.format = format;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Integer> getBtype() {
    return this.btype;
  }

  public void setBtype(List<Integer> btype) {
    this.btype = btype;
  }

  public List<Integer> getBattr() {
    return this.battr;
  }

  public void setBattr(List<Integer> battr) {
    this.battr = battr;
  }

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public List<String> getMimes() {
    return this.mimes;
  }

  public void setMimes(List<String> mimes) {
    this.mimes = mimes;
  }

  public Integer getWmax() {
    return wmax;
  }

  public void setWmax(Integer wmax) {
    this.wmax = wmax;
  }

  public Integer getWmin() {
    return wmin;
  }

  public void setWmin(Integer wmin) {
    this.wmin = wmin;
  }

  public Integer getHmax() {
    return hmax;
  }

  public void setHmax(Integer hmax) {
    this.hmax = hmax;
  }

  public Integer getHmin() {
    return hmin;
  }

  public void setHmin(Integer hmin) {
    this.hmin = hmin;
  }

  public Integer getTopframe() {
    return this.topframe;
  }

  public void setTopframe(Integer topframe) {
    this.topframe = topframe;
  }

  public List<Integer> getExpdir() {
    return this.expdir;
  }

  public void setExpdir(List<Integer> expdir) {
    this.expdir = expdir;
  }

  public List<Integer> getApi() {
    return this.api;
  }

  public void setApi(List<Integer> api) {
    this.api = api;
  }

  public Integer getVcm() {
    return this.vcm;
  }

  public void setVcm(Integer vcm) {
    this.vcm = vcm;
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
    Banner banner = (Banner) o;
    return Objects.equals(getW(), banner.getW())
        && Objects.equals(getH(), banner.getH())
        && Objects.equals(getFormat(), banner.getFormat())
        && Objects.equals(getId(), banner.getId())
        && Objects.equals(getBtype(), banner.getBtype())
        && Objects.equals(getBattr(), banner.getBattr())
        && Objects.equals(getPos(), banner.getPos())
        && Objects.equals(getMimes(), banner.getMimes())
        && Objects.equals(getTopframe(), banner.getTopframe())
        && Objects.equals(getWmax(), banner.getWmax())
        && Objects.equals(getWmin(), banner.getWmin())
        && Objects.equals(getHmax(), banner.getHmax())
        && Objects.equals(getHmin(), banner.getHmin())
        && Objects.equals(getExpdir(), banner.getExpdir())
        && Objects.equals(getApi(), banner.getApi())
        && Objects.equals(getVcm(), banner.getVcm())
        && Objects.equals(getExt(), banner.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getW(),
        getH(),
        getFormat(),
        getId(),
        getBtype(),
        getBattr(),
        getPos(),
        getMimes(),
        getTopframe(),
        getWmax(),
        getWmin(),
        getHmax(),
        getHmin(),
        getExpdir(),
        getApi(),
        getVcm(),
        getExt());
  }
}
