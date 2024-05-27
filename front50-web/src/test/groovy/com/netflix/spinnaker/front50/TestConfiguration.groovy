/*
 * Copyright 2024 OpsMx
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.netflix.spinnaker.front50

import com.netflix.spinnaker.fiat.shared.FiatPermissionEvaluator
import com.netflix.spinnaker.fiat.shared.FiatService
import com.netflix.spinnaker.fiat.shared.FiatStatus
import com.netflix.spinnaker.front50.config.FiatConfigurationProperties
import com.netflix.spinnaker.front50.model.pipeline.PipelineDAO
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import spock.mock.DetachedMockFactory

@Configuration
class TestConfiguration {

  DetachedMockFactory detachedMockFactory = new DetachedMockFactory()

  @Bean
  PipelineDAO pipelineDAO() {
    return detachedMockFactory.Stub(PipelineDAO)
  }

  @Bean
  FiatPermissionEvaluator fiatPermissionEvaluator() {
    return detachedMockFactory.Stub(FiatPermissionEvaluator)
  }

  @Bean
  FiatConfigurationProperties fiatConfigurationProperties() {
    return detachedMockFactory.Stub(FiatConfigurationProperties)
  }

  @Bean
  FiatStatus fiatStatus() {
    return detachedMockFactory.Stub(FiatStatus)
  }

  @Bean
  FiatService fiatService() {
    return detachedMockFactory.Stub(FiatService)
  }
}

