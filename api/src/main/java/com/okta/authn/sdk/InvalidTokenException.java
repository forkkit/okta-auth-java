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
package com.okta.authn.sdk;

import com.okta.sdk.error.Error;
import com.okta.sdk.resource.ResourceException;

/**
 * Invalid token provided. This exception
 * was thrown as a result of a contains error information returned {@code 4xx} status, related error messages are
 * contained within this exception.
 *
 * @since 0.1.0
 */
public class InvalidTokenException extends AuthenticationException {

    public static final String ERROR_CODE = "E0000011";

    public InvalidTokenException(Error error) {
        super(error);
    }

    public InvalidTokenException(ResourceException e) {
        super(e);
    }
}