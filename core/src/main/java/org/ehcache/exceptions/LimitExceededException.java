/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ehcache.exceptions;

import org.ehcache.sizeof.SizeOfEngineConfiguration;
import org.ehcache.spi.sizeof.SizeOfEngine;

/**
 * This exception is thrown when {@link SizeOfEngine} reaches
 * the maximum limit defined in {@link SizeOfEngineConfiguration}
 * while sizing the object on heap
 *
 * @author Abhilash
 *
 */
public class LimitExceededException extends Exception {

  /**
   * Creates an exception with the provided message
   *
   * @param message information about the exception
   */
  public LimitExceededException(String message) {
    super(message);
  }

}
