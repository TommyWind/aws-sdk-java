/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetJourneyExecutionActivityMetricsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJourneyExecutionActivityMetricsResultJsonUnmarshaller implements
        Unmarshaller<GetJourneyExecutionActivityMetricsResult, JsonUnmarshallerContext> {

    public GetJourneyExecutionActivityMetricsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetJourneyExecutionActivityMetricsResult getJourneyExecutionActivityMetricsResult = new GetJourneyExecutionActivityMetricsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getJourneyExecutionActivityMetricsResult;
        }

        while (true) {
            if (token == null)
                break;

            getJourneyExecutionActivityMetricsResult.setJourneyExecutionActivityMetricsResponse(JourneyExecutionActivityMetricsResponseJsonUnmarshaller
                    .getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getJourneyExecutionActivityMetricsResult;
    }

    private static GetJourneyExecutionActivityMetricsResultJsonUnmarshaller instance;

    public static GetJourneyExecutionActivityMetricsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetJourneyExecutionActivityMetricsResultJsonUnmarshaller();
        return instance;
    }
}
