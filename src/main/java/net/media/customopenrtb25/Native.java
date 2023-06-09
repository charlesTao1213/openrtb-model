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

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Map;

/**
 * Created by vishnu on 6/5/16.
 */
public class Native {

    public static final String DEFAULT_NATIVE_VERSION = "1.1";

    private String request;

    private String ver = DEFAULT_NATIVE_VERSION;

    private List<Integer> api;

    private List<Integer> battr;

    private Map<String, Object> ext;

    @Valid
    @NotNull
    @JSONField(name = "native")
    @JsonAlias("native")
    private NativeRequest nativeRequest;


    public Native() {
    }


    public NativeRequest getNativeRequest() {
        return nativeRequest;
    }

    public void setNativeRequest(NativeRequest nativeRequest) {
        this.nativeRequest = nativeRequest;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("native", nativeRequest);
        this.request = jsonObject.toJSONString();
    }

    public @NotNull String getRequest() {
        return this.request;
    }

    public void setRequest(@NotNull String request) {
        this.request = request;
    }

    public String getVer() {
        return this.ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public void setApi(List<Integer> api) {
        this.api = api;
    }

    public List<Integer> getBattr() {
        return this.battr;
    }

    public void setBattr(List<Integer> battr) {
        this.battr = battr;
    }

    public Map<String, Object> getExt() {
        return this.ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }


}
