/*
 * Copyright [2015] [Letsgood.com s.r.o.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.Copyright [2015] [Letsgood.com s.r.o.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by Bc. Pavel Stambrecht for Letsgood.com s.r.o.
 */

package com.letsgood.synergykitsdkandroid.resources;

import com.google.gson.annotations.Expose;

/**
 * Created by Letsgood.com - Pavel Stambrecht on 13. 4. 2015.
 */
public class SynergykitFacebookAuthData {

    /* Attribute */
    @Expose
    private String id;
    @Expose
    private String accessToken;

    /* Constructor */
    public SynergykitFacebookAuthData(String id, String accessToken) {
        this.id = id;
        this.accessToken = accessToken;
    }

    /* Id getter */
    public String getId() {
        return id;
    }

    /* Id setter */
    public void setId(String id) {
        this.id = id;
    }

    /* Access token getter */
    public String getAccessToken() {
        return accessToken;
    }

    /* Access token setter */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
