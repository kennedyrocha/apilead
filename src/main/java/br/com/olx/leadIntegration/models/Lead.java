package br.com.olx.leadIntegration.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="LEAD", schema="sql10501504")
public class Lead implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AUTOID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="ORIGEM_LEAD")
	private String leadOrigin;

	@Column(name="DATA")
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private Date timestamp;

	@Column(name="ORIGEM_LEAD_ID")
    private String originLeadId;

	@Column(name="ORIGEM_LISTING_ID")
    private String originListingId;

	@Column(name="CLIENT_LISTING_ID")
    private String clientListingId;

	@Column(name="NOME")
    private String name;

	@Column(name="EMAIL")
    private String email;

	@Column(name="DDD")
    private String ddd;

	@Column(name="TELEFONE")
    private String phone;

	@Column(name="MENSAGEM")
    private String message;


	public Lead() {
		super();
	}


	public Lead(Integer id, String leadOrigin, Date timestamp, String originLeadId, String originListingId,
			String clientListingId, String name, String email, String ddd, String phone, String message) {
		super();
		this.id = id;
		this.leadOrigin = leadOrigin;
		this.timestamp = timestamp;
		this.originLeadId = originLeadId;
		this.originListingId = originListingId;
		this.clientListingId = clientListingId;
		this.name = name;
		this.email = email;
		this.ddd = ddd;
		this.phone = phone;
		this.message = message;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLeadOrigin() {
		return leadOrigin;
	}


	public void setLeadOrigin(String leadOrigin) {
		this.leadOrigin = leadOrigin;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public String getOriginLeadId() {
		return originLeadId;
	}


	public void setOriginLeadId(String originLeadId) {
		this.originLeadId = originLeadId;
	}


	public String getOriginListingId() {
		return originListingId;
	}


	public void setOriginListingId(String originListingId) {
		this.originListingId = originListingId;
	}


	public String getClientListingId() {
		return clientListingId;
	}


	public void setClientListingId(String clientListingId) {
		this.clientListingId = clientListingId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public int hashCode() {
		return Objects.hash(clientListingId, ddd, email, id, leadOrigin, message, name, originLeadId, originListingId,
				phone, timestamp);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lead other = (Lead) obj;
		return Objects.equals(clientListingId, other.clientListingId) && Objects.equals(ddd, other.ddd)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(leadOrigin, other.leadOrigin) && Objects.equals(message, other.message)
				&& Objects.equals(name, other.name) && Objects.equals(originLeadId, other.originLeadId)
				&& Objects.equals(originListingId, other.originListingId) && Objects.equals(phone, other.phone)
				&& Objects.equals(timestamp, other.timestamp);
	}
}