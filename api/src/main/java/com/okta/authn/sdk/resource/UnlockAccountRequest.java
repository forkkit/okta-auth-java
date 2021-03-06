/*
 * Copyright 2018 Okta, Inc.
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

public interface UnlockAccountRequest extends ExtensibleResource {

    String getRelayState();

    UnlockAccountRequest setRelayState(String relayState);

    String getUsername();

    UnlockAccountRequest setUsername(String username);

    FactorType getFactorType();

    UnlockAccountRequest setFactorType(FactorType factorType);
}