/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicemix.smpp;

import java.util.List;

import org.apache.servicemix.common.DefaultComponent;

/**
 * @org.apache.xbean.XBean element="component" description="Smpp Component"
 * 
 * @author lhein
 */
public class SmppComponent extends DefaultComponent {
    private SmppEndpointType[] endpoints;

    /**
     * @return
     */
    public SmppEndpointType[] getEndpoints() {
        return endpoints;
    }

    /**
     * @param endpoints
     */
    public void setEndpoints(SmppEndpointType[] endpoints) {
        this.endpoints = endpoints;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.apache.servicemix.common.DefaultComponent#getConfiguredEndpoints()
     */
    protected List getConfiguredEndpoints() {
        return asList(getEndpoints());
    }

    /*
     * (non-Javadoc)
     * @see org.apache.servicemix.common.DefaultComponent#getEndpointClasses()
     */
    protected Class[] getEndpointClasses() {
        return new Class[] {SmppPollerEndpoint.class, SmppSenderEndpoint.class};
    }
}
