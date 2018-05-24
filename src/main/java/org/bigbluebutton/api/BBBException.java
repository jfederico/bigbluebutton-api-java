/**
 * BigBlueButton - http://www.bigbluebutton.org
 *
 * Copyright (c) 2018 onwards by respective authors (see below). All rights reserved.
 *
 * BigBlueButton is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BigBlueButton is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.bigbluebutton.api;

/**
 * Exception generated while communicating with BBB server
 *
 * see https://github.com/sakaicontrib/bbb-tool/blob/master/api/src/java/org/sakaiproject/bbb/api/BBBException.java
 */
public class BBBException extends Exception {
	private static final long	serialVersionUID			= 2421100107566638321L;

	public static final String  MESSAGEKEY_HTTPERROR            = "httpError";
	public static final String  MESSAGEKEY_NOTFOUND             = "notFound";
	public static final String  MESSAGEKEY_NOACTION             = "noActionSpecified";
	public static final String  MESSAGEKEY_IDNOTUNIQUE          = "idNotUnique";
	public static final String  MESSAGEKEY_NOTSTARTED           = "notStarted";
	public static final String  MESSAGEKEY_ALREADYENDED         = "alreadyEnded";
	public static final String  MESSAGEKEY_INTERNALERROR        = "internalError";
	public static final String  MESSAGEKEY_UNREACHABLE          = "unreachableServerError";
	public static final String  MESSAGEKEY_INVALIDRESPONSE      = "invalidResponseError";
	public static final String  MESSAGEKEY_GENERALERROR         = "generalError";

	private String messageKey;

	public BBBException(String messageKey, String message, Throwable cause) {
		super(message, cause);
		this.messageKey = messageKey;
	}

	public BBBException(String messageKey, String message) {
		super(message);
		this.messageKey = messageKey;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public String getPrettyMessage() {
		String _message = getMessage();
		String _messageKey = getMessageKey();

		StringBuilder pretty = new StringBuilder();
		if(_message != null) {
			pretty.append(_message);
		}
		if(_messageKey != null && !"".equals(_messageKey.trim())) {
			pretty.append(" (");
			pretty.append(_messageKey);
			pretty.append(")");
		}
		return pretty.toString();
	}

}
