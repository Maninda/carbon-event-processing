/*
*  Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.event.publisher.core.internal.config;


import org.wso2.carbon.event.output.adaptor.core.message.config.OutputEventAdaptorMessageConfiguration;

public class ToPropertyConfiguration {

    private String eventAdaptorName;

    private String eventAdaptorType;

    private OutputEventAdaptorMessageConfiguration outputEventAdaptorMessageConfiguration;

    public OutputEventAdaptorMessageConfiguration getOutputEventAdaptorMessageConfiguration() {
        return outputEventAdaptorMessageConfiguration;
    }

    public void setOutputEventAdaptorMessageConfiguration(
            OutputEventAdaptorMessageConfiguration outputEventAdaptorMessageConfiguration) {
        this.outputEventAdaptorMessageConfiguration = outputEventAdaptorMessageConfiguration;
    }

    public String getEventAdaptorType() {
        return eventAdaptorType;
    }

    public void setEventAdaptorType(String eventAdaptorType) {
        this.eventAdaptorType = eventAdaptorType;
    }

    public String getEventAdaptorName() {
        return eventAdaptorName;
    }

    public void setEventAdaptorName(String eventAdaptorName) {
        this.eventAdaptorName = eventAdaptorName;
    }


}