/*
   Copyright 2019-2021 WeAreFrank!

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package org.frankframework.pipes;

import java.nio.file.Path;

import org.frankframework.filesystem.FileSystemPipe;
import org.frankframework.filesystem.LocalFileSystem;

public class LocalFileSystemPipe extends FileSystemPipe<Path, LocalFileSystem>{

	public LocalFileSystemPipe() {
		setFileSystem(new LocalFileSystem());
	}

	/** the folder that serves as the root of this virtual filesystem */
	public void setRoot(String root) {
		getFileSystem().setRoot(root);
	}

}