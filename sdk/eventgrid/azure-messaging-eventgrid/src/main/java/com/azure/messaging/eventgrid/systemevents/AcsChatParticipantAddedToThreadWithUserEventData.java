// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Schema of the Data property of an EventGridEvent for an Microsoft.Communication.ChatParticipantAddedToThreadWithUser
 * event.
 */
@Fluent
public final class AcsChatParticipantAddedToThreadWithUserEventData extends AcsChatThreadEventBaseProperties {
    /*
     * The time at which the user was added to the thread
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /*
     * The communication identifier of the user who added the user
     */
    @JsonProperty(value = "addedByCommunicationIdentifier")
    private CommunicationIdentifierModel addedByCommunicationIdentifier;

    /*
     * The details of the user who was added
     */
    @JsonProperty(value = "participantAdded")
    private AcsChatThreadParticipantProperties participantAdded;

    /**
     * Get the time property: The time at which the user was added to the thread.
     *
     * @return the time value.
     */
    public OffsetDateTime getTime() {
        return this.time;
    }

    /**
     * Set the time property: The time at which the user was added to the thread.
     *
     * @param time the time value to set.
     * @return the AcsChatParticipantAddedToThreadWithUserEventData object itself.
     */
    public AcsChatParticipantAddedToThreadWithUserEventData setTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }

    /**
     * Get the addedByCommunicationIdentifier property: The communication identifier of the user who added the user.
     *
     * @return the addedByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getAddedByCommunicationIdentifier() {
        return this.addedByCommunicationIdentifier;
    }

    /**
     * Set the addedByCommunicationIdentifier property: The communication identifier of the user who added the user.
     *
     * @param addedByCommunicationIdentifier the addedByCommunicationIdentifier value to set.
     * @return the AcsChatParticipantAddedToThreadWithUserEventData object itself.
     */
    public AcsChatParticipantAddedToThreadWithUserEventData setAddedByCommunicationIdentifier(
            CommunicationIdentifierModel addedByCommunicationIdentifier) {
        this.addedByCommunicationIdentifier = addedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the participantAdded property: The details of the user who was added.
     *
     * @return the participantAdded value.
     */
    public AcsChatThreadParticipantProperties getParticipantAdded() {
        return this.participantAdded;
    }

    /**
     * Set the participantAdded property: The details of the user who was added.
     *
     * @param participantAdded the participantAdded value to set.
     * @return the AcsChatParticipantAddedToThreadWithUserEventData object itself.
     */
    public AcsChatParticipantAddedToThreadWithUserEventData setParticipantAdded(
            AcsChatThreadParticipantProperties participantAdded) {
        this.participantAdded = participantAdded;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadWithUserEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadWithUserEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadWithUserEventData setRecipientCommunicationIdentifier(
            CommunicationIdentifierModel recipientCommunicationIdentifier) {
        super.setRecipientCommunicationIdentifier(recipientCommunicationIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadWithUserEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatParticipantAddedToThreadWithUserEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
