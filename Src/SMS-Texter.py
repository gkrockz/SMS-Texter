import os
from twilio.rest import Client

# Your Account Sid and Auth Token from twilio.com/console.

account_sid = os.environ['TWILIO_ACCOUNT_SID']  # Your SID 
auth_token = os.environ['TWILIO_AUTH_TOKEN']    # Your AUTH_TOKEN
client = Client(account_sid, auth_token)

message = client.messages.create(
                              body=' I CANT BELIEVE THIS WORKS',
                              from_='+917200372009', 	# Your Twilio Generated Number.
                              to='+918754105798' 		# Your Reciever Number.
                          )
