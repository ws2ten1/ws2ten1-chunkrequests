/*
 * Copyright 2019 the original author or authors.
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
package org.polycreo.chunkrequests;

/**
 * Abstract interface for value-based pagination information.
 */
public interface Chunkable {
	
	/**
	 * Returns token for pagination.
	 *
	 * @return the token
	 */
	String getPaginationToken();
	
	/**
	 * Returns the relation of current chunk to retrieve.
	 *
	 * @return the relation
	 */
	PaginationRelation getPaginationRelation();
	
	/**
	 * Returns the number of items to be returned.
	 *
	 * @return the number of items of that chunk
	 */
	Integer getMaxPageSize();
	
	/**
	 * Returns the direction the items sorted.
	 *
	 * @return the direction
	 */
	Direction getDirection();
	
	
	enum PaginationRelation {
		NEXT,
		PREV
	}
}
