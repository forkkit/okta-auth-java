/*
 * Copyright 2020-Present Okta, Inc.
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
 */
package com.okta.authn.sdk.resource;

import com.okta.sdk.resource.ExtensibleResource;

public interface PushUserFactorProfile extends ExtensibleResource, UserFactorProfile {

    String getCredentialId();

    PushUserFactorProfile setCredentialId(String credentialId);

    String getDeviceToken();

    PushUserFactorProfile setDeviceToken(String deviceToken);

    String getDeviceType();

    PushUserFactorProfile setDeviceType(String deviceType);

    String getName();

    PushUserFactorProfile setName(String name);

    String getPlatform();

    PushUserFactorProfile setPlatform(String platform);

    String getVersion();

    PushUserFactorProfile setVersion(String version);

}
