/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.launcher.osio.che;

public enum CheStack {
    VERTX("vert.x", "Vert.x"),
    SPRING_BOOT("spring-boot", "Spring Boot"),
    WILDFLY_SWARM("wildfly-swarm", "WildFly Swarm"),
    JAVA_CENTOS("java-centos", "Java"),
    NODE_JS("nodejs-centos", "NodeJS"),
    GOLANG("go-default", "Golang");

    private final String id;

    private final String name;

    CheStack(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CheStack{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
