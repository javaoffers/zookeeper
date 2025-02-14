/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zookeeper.version;

public interface Info {
//    int MAJOR=${parsedVersion.majorVersion};
//    int MINOR=${parsedVersion.minorVersion};
//    int MICRO=${parsedVersion.incrementalVersion};
//    String QUALIFIER="${parsedVersion.qualifier}".isEmpty() ? null : "${parsedVersion.qualifier}";
//    int REVISION=-1; //@deprecated, please use REVISION_HASH
//    String REVISION_HASH="${mvngit.commit.id}";
//    String BUILD_DATE="${build.time}";
    /**
     * 一下拷贝自 zk jar 包中的代码
     */
    public static final int MAJOR=3;
    public static final int MINOR=4;
    public static final int MICRO=9;
    public static final String QUALIFIER=null;
    int REVISION=-1;
    public static final String REVISION_HASH=1757313+"";
    public static final String BUILD_DATE="08/23/2016 08:54 GMT";
}
