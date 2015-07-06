package mmatters.vo;

public class Message {
	long id;
	long fromId;
	long toId;
	String title;
	String content;
	boolean deletedBySender;
	boolean deletedByReceiver;
	boolean readByReceiver;
}
