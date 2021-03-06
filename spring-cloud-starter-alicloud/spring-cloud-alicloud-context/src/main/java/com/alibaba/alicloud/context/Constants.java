/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.alicloud.context;

/**
 * @author <a href="mailto:fangjian0423@gmail.com">Jim</a>
 */
public final class Constants {

	private Constants() {
		throw new AssertionError("Must not instantiate constant utility class");
	}

	public final class Sentinel {

		/**
		 * prefix of sentinel.
		 */
		public static final String PROPERTY_PREFIX = "spring.cloud.sentinel";

		/**
		 * nacos access key.
		 */
		public static final String NACOS_DATASOURCE_AK = PROPERTY_PREFIX
				+ ".nacos.config.access-key";

		/**
		 * nacos secret key.
		 */
		public static final String NACOS_DATASOURCE_SK = PROPERTY_PREFIX
				+ ".nacos.config.secret-key";

		/**
		 * nacos namespace.
		 */
		public static final String NACOS_DATASOURCE_NAMESPACE = PROPERTY_PREFIX
				+ ".nacos.config.namespace";

		/**
		 * nacos endpoint.
		 */
		public static final String NACOS_DATASOURCE_ENDPOINT = PROPERTY_PREFIX
				+ ".nacos.config.endpoint";

		/**
		 * nacos project name.
		 */
		public static final String PROJECT_NAME = PROPERTY_PREFIX
				+ ".nacos.config.project-name";

		private Sentinel() {
			throw new AssertionError("Must not instantiate constant utility class");
		}

	}

}
