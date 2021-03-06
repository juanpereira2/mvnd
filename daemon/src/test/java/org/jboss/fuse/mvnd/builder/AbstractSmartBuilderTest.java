/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.fuse.mvnd.builder;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.apache.maven.project.MavenProject;
import org.junit.jupiter.api.Assertions;

abstract class AbstractSmartBuilderTest {
    protected void assertProjects(Collection<MavenProject> actual, MavenProject... expected) {
        Assertions.assertEquals(new HashSet<MavenProject>(Arrays.asList(expected)), new HashSet<>(actual));
    }

    protected MavenProject newProject(String artifactId) {
        MavenProject project = new MavenProject();
        project.setGroupId("test");
        project.setArtifactId(artifactId);
        project.setVersion("1");
        return project;
    }

}
