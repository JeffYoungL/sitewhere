/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.web.spi.microservice;

import com.sitewhere.grpc.model.spi.client.IDeviceManagementApiChannel;
import com.sitewhere.grpc.model.spi.client.IUserManagementApiChannel;
import com.sitewhere.microservice.spi.IGlobalMicroservice;

/**
 * Microservice that provides web/REST functionality.
 * 
 * @author Derek
 */
public interface IWebRestMicroservice extends IGlobalMicroservice {

    /**
     * User management API access via GRPC channel.
     * 
     * @return
     */
    public IUserManagementApiChannel getUserManagementApiChannel();

    /**
     * Device management API access via GRPC channel.
     * 
     * @return
     */
    public IDeviceManagementApiChannel getDeviceManagementApiChannel();
}