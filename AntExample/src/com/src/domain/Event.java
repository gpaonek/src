package com.src.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.bson.BSONObject;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@XmlRootElement
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Event implements DBObject{

	private int eventId;
	private String name;
	private String type;
	private String date;
	private int time;
	private String longitude;
	private String latitude;
	private String invitees;
	
	public Event(BasicDBObject dbo) {
	    super();
	}
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getInvitees() {
		return invitees;
	}
	public void setInvitees(String invitees) {
		this.invitees = invitees;
	}
	@Override
	public boolean containsField(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsKey(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object get(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object put(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putAll(BSONObject arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object removeField(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map toMap() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isPartialObject() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void markAsPartialObject() {
		// TODO Auto-generated method stub
		
	}
	
}
