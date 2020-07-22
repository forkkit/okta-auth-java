/*
 * Copyright 2018-Present Okta, Inc.
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
package com.okta.authn.sdk.impl.resource;

import com.okta.authn.sdk.resource.FactorEnrollRequest;
import com.okta.authn.sdk.resource.UserFactorProfile;
import com.okta.sdk.impl.ds.InternalDataStore;
import com.okta.sdk.impl.resource.AbstractResource;
import com.okta.sdk.impl.resource.EnumProperty;
import com.okta.sdk.impl.resource.Property;
import com.okta.sdk.impl.resource.ResourceReference;
import com.okta.sdk.impl.resource.StringProperty;
import com.okta.authn.sdk.resource.CallUserFactorProfile;
import com.okta.authn.sdk.resource.EmailUserFactorProfile;
import com.okta.sdk.resource.user.factor.FactorProvider;
import com.okta.sdk.resource.user.factor.FactorType;
import com.okta.authn.sdk.resource.HardwareUserFactorProfile;
import com.okta.authn.sdk.resource.PushUserFactorProfile;
import com.okta.authn.sdk.resource.SecurityQuestionUserFactorProfile;
import com.okta.authn.sdk.resource.SmsUserFactorProfile;
import com.okta.authn.sdk.resource.TokenUserFactorProfile;
import com.okta.authn.sdk.resource.TotpUserFactorProfile;
import com.okta.authn.sdk.resource.U2fUserFactorProfile;
import com.okta.authn.sdk.resource.WebAuthnUserFactorProfile;
import com.okta.authn.sdk.resource.WebUserFactorProfile;

import java.util.Map;

public class DefaultFactorEnrollRequest extends AbstractResource implements FactorEnrollRequest {

    private static final StringProperty STATE_TOKEN_PROPERTY = new StringProperty("stateToken");
    private static final EnumProperty<FactorType> FACTOR_TYPE_PROPERTY = new EnumProperty<>("factorType", FactorType.class);
    private static final ResourceReference<CallUserFactorProfile> CALL_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", CallUserFactorProfile.class, true);
    private static final ResourceReference<EmailUserFactorProfile> EMAIL_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", EmailUserFactorProfile.class, true);
    private static final ResourceReference<HardwareUserFactorProfile> HARDWARE_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", HardwareUserFactorProfile.class, true);
    private static final ResourceReference<PushUserFactorProfile> PUSH_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", PushUserFactorProfile.class, true);
    private static final ResourceReference<SecurityQuestionUserFactorProfile> SECURITY_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", SecurityQuestionUserFactorProfile.class, true);
    private static final ResourceReference<SmsUserFactorProfile> SMS_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", SmsUserFactorProfile.class, true);
    private static final ResourceReference<TokenUserFactorProfile> TOKEN_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", TokenUserFactorProfile.class, true);
    private static final ResourceReference<TotpUserFactorProfile> TOTP_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", TotpUserFactorProfile.class, true);
    private static final ResourceReference<U2fUserFactorProfile> U2F_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", U2fUserFactorProfile.class, true);
    private static final ResourceReference<WebAuthnUserFactorProfile> WEB_AUTHN_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", WebAuthnUserFactorProfile.class, true);
    private static final ResourceReference<WebUserFactorProfile> WEB_USER_FACTOR_PROFILE_PROPERTY = new ResourceReference<>("profile", WebUserFactorProfile.class, true);
    private static final EnumProperty<FactorProvider> PROVIDER_PROPERTY = new EnumProperty<>("provider", FactorProvider.class);

    public DefaultFactorEnrollRequest(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultFactorEnrollRequest(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return createPropertyDescriptorMap(
            STATE_TOKEN_PROPERTY,
            FACTOR_TYPE_PROPERTY,
            CALL_USER_FACTOR_PROFILE_PROPERTY,
            EMAIL_USER_FACTOR_PROFILE_PROPERTY,
            HARDWARE_USER_FACTOR_PROFILE_PROPERTY,
            PUSH_USER_FACTOR_PROFILE_PROPERTY,
            SECURITY_USER_FACTOR_PROFILE_PROPERTY,
            SMS_USER_FACTOR_PROFILE_PROPERTY,
            TOKEN_USER_FACTOR_PROFILE_PROPERTY,
            TOTP_USER_FACTOR_PROFILE_PROPERTY,
            U2F_USER_FACTOR_PROFILE_PROPERTY,
            WEB_AUTHN_USER_FACTOR_PROFILE_PROPERTY,
            WEB_USER_FACTOR_PROFILE_PROPERTY,
            PROVIDER_PROPERTY);
    }

    @Override
    public String getStateToken() {
        return getString(STATE_TOKEN_PROPERTY);
    }

    @Override
    public FactorEnrollRequest setStateToken(String stateToken) {
        setProperty(STATE_TOKEN_PROPERTY, stateToken);
        return this;
    }

    @Override
    public FactorType getFactorType() {
        return getEnumProperty(FACTOR_TYPE_PROPERTY);
    }

    @Override
    public FactorEnrollRequest setFactorType(FactorType factorType) {
        setProperty(FACTOR_TYPE_PROPERTY, factorType);
        return this;
    }

    @Override
    public FactorProvider getProvider() {
        return  getEnumProperty(PROVIDER_PROPERTY);
    }

    @Override
    public FactorEnrollRequest setProvider(FactorProvider provider) {
        setProperty(PROVIDER_PROPERTY, provider);
        return this;
    }

    @Override
    public FactorEnrollRequest setFactorProfile(UserFactorProfile userFactorProfile) {

        if (userFactorProfile instanceof CallUserFactorProfile) {
            setProperty(CALL_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof EmailUserFactorProfile) {
            setProperty(EMAIL_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof HardwareUserFactorProfile) {
            setProperty(HARDWARE_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof PushUserFactorProfile) {
            setProperty(PUSH_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof SecurityQuestionUserFactorProfile) {
            setProperty(SECURITY_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof SmsUserFactorProfile) {
            setProperty(SMS_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof TokenUserFactorProfile) {
            setProperty(TOKEN_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof TotpUserFactorProfile) {
            setProperty(TOTP_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof U2fUserFactorProfile) {
            setProperty(U2F_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof WebUserFactorProfile) {
            setProperty(WEB_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        } else if (userFactorProfile instanceof WebAuthnUserFactorProfile) {
            setProperty(WEB_AUTHN_USER_FACTOR_PROFILE_PROPERTY, userFactorProfile);
        }

        return this;
    }
}
