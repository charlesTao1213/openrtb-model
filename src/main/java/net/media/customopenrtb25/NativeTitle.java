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

import jakarta.validation.constraints.NotNull;

import java.util.Map;
import java.util.Objects;

public class NativeTitle {

  @NotNull
  private Integer len;

  private Map<String, Object> ext;

  public NativeTitle() {}

  public @NotNull Integer getLen() {
    return this.len;
  }

  public void setLen(@NotNull Integer len) {
    this.len = len;
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
    NativeTitle that = (NativeTitle) o;
    return Objects.equals(getLen(), that.getLen()) && Objects.equals(getExt(), that.getExt());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLen(), getExt());
  }
}
