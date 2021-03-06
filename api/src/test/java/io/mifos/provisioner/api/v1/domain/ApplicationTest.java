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
package io.mifos.provisioner.api.v1.domain;

import io.mifos.core.test.domain.ValidationTest;
import io.mifos.core.test.domain.ValidationTestCase;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Myrle Krantz
 */
public class ApplicationTest extends ValidationTest<Application> {

  public ApplicationTest(ValidationTestCase<Application> testCase) {
    super(testCase);
  }

  @Override
  protected Application createValidTestSubject() {
    final Application ret = new Application();
    ret.setName("bebop-v3");
    ret.setHomepage("http://xyz.bebop:2021/v1");
    ret.setDescription("bebop manager");
    ret.setVendor("fineract");
    return ret;
  }

  @Parameterized.Parameters
  public static Collection testCases() {
    final Collection<ValidationTestCase> ret = new ArrayList<>();
    ret.add(new ValidationTestCase<Application>("basicCase")
            .adjustment(x -> {})
            .valid(true));
    ret.add(new ValidationTestCase<Application>("invalidApplicationName")
            .adjustment(x -> x.setName("bebop-dowop"))
            .valid(false));
    ret.add(new ValidationTestCase<Application>("nullApplicationName")
            .adjustment(x -> x.setName(null))
            .valid(false));
    return ret;
  }

}