NEW FEATURES:
- All mandatory extensions.
- Enhanced user messaging; users can now "mark as unread", delete a message sent, or archive the conversation.
- Now can check new message sent by other users! (automatically mark message as read/unread)
- Additional requirements for events; events can now require the room to have a projector and/or tables, and capacity
    when creating an event, organizers are only presented with the valid rooms.
- Organizer can also change the capacity of existing event
- Added a database to store the information of our program (requires mongodb).
- Added a password encryption system so users passwords cannot simply be accessed.


HOW TO USE:

To install mongodb:
go to file -> project structure -> '+' on the right -> library -> from maven ->
-> type "org.mongodb:mongo-java-driver:3.12.7" -> ok -> ok -> apply -> ok

Run Main.main(). Either register a new account or log in. If registering, you will be given a unique ID and prompted to
input a password. Remember your ID and password! After registering, you will be able to log in with your credentials.
When you log in you will be presented with a menu of options specific to the type of account you created.

The following are the options for each user:

Organizer:
- Create User: To create other user accounts (Speaker and Attendee).
- View Events: To display all events currently scheduled in the conference.
- Schedule New Events: To create a new event.
- Cancel Event: To cancel a current event.
- Reschedule Event: To change the time of an event.
- Register New Room: To create a new room
- Messages: To view messages, access message options, or message other users.
- Change Event Capacity: To change the capacity of an event.

Attendee:
- View Schedule: To display all events this attendee is currently signed up for.
- View Events: To display all events in the conference.
- Register for Event: To sign up for an event.
- Unregister for Event: To cancel enrollment in an event.
- Contacts: To view and add other users to their list of contacts.
- Message: To view messages, access message options, or message other users.

Speaker:
- View Talks: To display all events this speaker is currently hosting.
- Messages: To view messages, access message options, or message other users.


Design Patterns:

Facade:
- AttendeeUpdaterFacade
- GuestUpdaterFacade
- OrganizerUpdaterFacade
- UserUpdaterFacade
- AttendeeManagerFacade
- OrganizerManagerFacade
- SpeakerManagerFacade
- UserManagerFacade

This was used in our gateway classes because the many of the constructors in the updaters were getting quite
long, thus the facade is introduced to simplify the methods required by the client and hide some of the complexities.

Factory:
- ControllerFactory

Used in creation of the different controllers (guest / attendee / organizer / speaker). It helps obscure the
creation process of the controllers and clean up ConferenceSystem.
