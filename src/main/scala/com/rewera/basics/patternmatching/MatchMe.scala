package com.rewera.basics.patternmatching

sealed abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification

object MatchMe extends App {
  def showNotification(notification: Notification, importantPeopleList: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleList.contains(sender) =>
        "You've got an email from someone special!!!"
      case SMS(caller, _) if importantPeopleList.contains(caller) =>
        "You've got an SMS from someone special!!!"
      case VoiceRecording(contactName, _) if importantPeopleList.contains(contactName) =>
        "You've got a voice recording from someone special!!!"
      case _ =>
        showNormalNotification(notification)
    }

  }

  def showNormalNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(caller, message) =>
        s"You got an SMS from $caller! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  val someEmail = Email("mailmail@gmail.com", "Presence query", "Hi, I was wandering if you are there?")
  val someSms = SMS("123-456-789", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "http://voicerecording.org/123")

  val importantPeople = Seq("123-456-789", "Tom")

  println(showNotification(someEmail, importantPeople))
  println(showNotification(someSms, importantPeople))
  println(showNotification(someVoiceRecording, importantPeople))
}
