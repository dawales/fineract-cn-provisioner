/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.mifos.provisioner.rest.mapper;

import io.mifos.provisioner.api.v1.domain.Application;
import io.mifos.provisioner.internal.repository.ApplicationEntity;

public final class ApplicationMapper {

  private ApplicationMapper() {
    super();
  }

  public static Application map(final ApplicationEntity applicationEntity) {
    final Application application = new Application();
    application.setName(applicationEntity.getName());
    application.setDescription(applicationEntity.getDescription());
    application.setVendor(applicationEntity.getVendor());
    application.setHomepage(applicationEntity.getHomepage());
    return application;
  }

  public static ApplicationEntity map(final Application application) {
    final ApplicationEntity applicationEntity = new ApplicationEntity();
    applicationEntity.setName(application.getName());
    applicationEntity.setDescription(application.getDescription());
    applicationEntity.setVendor(application.getVendor());
    applicationEntity.setHomepage(application.getHomepage());
    return applicationEntity;
  }
}
