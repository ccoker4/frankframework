/*
   Copyright 2013 Nationale-Nederlanden, 2023 WeAreFrank!

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
package nl.nn.adapterframework.monitoring;

import nl.nn.adapterframework.configuration.ConfigurationException;
import nl.nn.adapterframework.core.INamedObject;
import nl.nn.adapterframework.doc.FrankDocGroup;
import nl.nn.adapterframework.monitoring.events.MonitorEvent;
import nl.nn.adapterframework.util.XmlBuilder;

/**
 * Interface to monitoring service. 
 * 
 * @author  Gerrit van Brakel
 * @since   4.7
 */
@FrankDocGroup(name = "Monitoring")
public interface IMonitorDestination extends INamedObject {

	void configure() throws ConfigurationException;

	void fireEvent(String monitorName, EventType eventType, Severity severity, String eventCode, MonitorEvent message);

	public XmlBuilder toXml();
}