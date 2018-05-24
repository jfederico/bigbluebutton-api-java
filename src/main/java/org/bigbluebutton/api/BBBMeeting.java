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

import java.util.Map;
import java.util.Date;
import java.util.HashMap;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Object for a BigBlueButton meeting.
 * @author Adrian Fish
 * Based on: https://github.com/sakaicontrib/bbb-tool/blob/master/api/src/java/org/sakaiproject/bbb/api/BBBMeeting.java
 *
 * Last modified by Yunkai Wang
 */
@Getter @Setter @ToString
public class BBBMeeting {
	private String name = null;
	private String meetingID;
	private String attendeePW = null;
	private String moderatorPW = null;
	private String dialNumber = null;
	private String voiceBridge = null;
	private String webVoice = null;
	private String logoutURL = null;
	private Boolean record = null;
	private Long duration = null;

	// user cannot directly modify this field
	@Setter (AccessLevel.NONE)
	private Map<String, String> meta = new HashMap<String, String>();
	private String moderatorOnlyMessage = null;
	private Boolean autoStartRecording = null;
	private Boolean allowStartStopRecording = null;
	private Boolean webcamsOnlyForModerator = null;
	private String logo = null;
	private String copyright = null;
	private Boolean muteOnStart = null;
	private String welcome = null;
	private Date startDate = null;
	private Date endDate = null;

	public BBBMeeting(String meetingID) {
		this.meetingID = meetingID;
	}

	public void addMeta(String key, String value) {
		meta.put(key, value);
	}

	public void removeMeta(String key) {
		if (meta.containsKey(key))
			meta.remove(key);
	}
}
