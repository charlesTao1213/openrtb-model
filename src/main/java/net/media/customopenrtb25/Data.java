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
public class Data {
  private String id;

  private String name;

  private List<Segment> segment;

  private Map<String, Object> ext;

  public Data() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Segment> getSegment() {
    return this.segment;
  }

  public void setSegment(List<Segment> segment) {
    this.segment = segment;
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
    Data data = (Data) o;
    return Objects.equals(getId(), data.getId())
        && Objects.equals(getName(), data.getName())
        && Objects.equals(getSegment(), data.getSegment())
        && Objects.equals(getExt(), data.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getSegment(), getExt());
  }
}
