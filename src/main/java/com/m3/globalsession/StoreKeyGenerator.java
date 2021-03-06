/*
 * Copyright 2012 M3, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package com.m3.globalsession;

public class StoreKeyGenerator {

    private final String sessionId;
    private final String namespace;

    public StoreKeyGenerator(String sessionId, String namespace) {
        this.sessionId = sessionId;
        this.namespace = namespace;
    }

    public String generate(String name) {
        return "GlobalSession::" + sessionId + "::" + namespace + "::" + name;
    }

}
