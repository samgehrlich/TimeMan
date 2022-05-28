# TimeMan
---

Design Document  

## Introduction 

Do you want an app to help you plan your time? TimeMan can help you with it's various new time saving and planning features

-	Personalized profile for users.
-	Tasks and events based on the profile.
-	User can add thier own tasks and todo lists that can be saved and repeated as seprate elements to save time.
-	Seamless implementation with other softwares such as Canvas/Email and other tools.  

Use your Android device to create your own calnder and plans. Create a personalized profile that caters to your time needs. Create reminders and tasks based on what you did in past saving you time. Receive alerts about upcoming tasks and plans. 

## Storyboard

[TimeMan Storyboard](https://projects.invisionapp.com/prototype/Plant-Diary-ck0bict0n005bqh01aaeu8tuu/play/c6560121)

![TimeManFirstScreen](https://user-images.githubusercontent.com/2224876/82161817-15ee8880-986e-11ea-8cda-f04ad1412893.png)

## Functional Requirements

### Requirement 100.0: Creation of Profile

#### Scenario

As a user interested in a time management app, I want to create a profile which caters to my need and has pre existing options for me.
#### Dependencies

Task search data are available and accessible.  

#### Assumptions

A list can be created and categorized based on age and occupation

-----

#### Examples
1.1  

**Given** a database of tasks is available 

**When**  my profile is set to “Student”  

**Then** I should be able to see tasks such as "Study Time" or "Meeting" as options while creating task on my calender 


1.2  
**Given** app implements data from 3rd party apps  

**When** I open my calender   

**Then** I should be able to click on my calender and see tasks from my work or school 

Source: Canvas/Outlook
task: Meeting with xyzh
Location: asndaosind

1.3  

**Given** Profile options are available  
**When** I search for “Par”  
**Then** I should be able to see "Parent" option.


### Requirement 101: Save Taks in calender

#### Scenario

As a user interested in plants, I want to be able to enter and save details of a specimen: date planted, photos, and locations, so that I can view a history of this plant.  

#### Dependencies
Plant search data are available and accessible.  
The device has a camera, and the user has granted access to the camera.  
The device has GPS capabilities, and the user has granted location access.  

#### Assumptions  
Scientific names are stated in Latin.  
Common names are stated in English.  

#### Examples  

1.1  
**Given** a feed of plant data is available  
**Given** GPS details are available  
**When**  

-	Select the plant Asimina triloba  
-	Add notes: “planted by Brandan Jones”  
**Then**  when I navigate to the Specimen History view, I should see at least one Asimina triloba specimen with the notes, “planted by Brandan Jones”  

2.1  
**Given** a feed of plant data is available  
**Given** GPS details are available  
**When**   

-	Select the plant Malus domestica ‘Fuji’  
-	Take a photo of a Fuji apple seedling  
**Then** when I navigate to the Specimen History view, I should see at least one Malus domestica ‘Fuji’ specimen with the a photo of a Fuji apple seedling.  

## Class Diagram

![ClassDiagram](https://user-images.githubusercontent.com/2224876/82162015-54387780-986f-11ea-998f-a45fdf8c3bf1.png)

### Class Diagram Description


**MainActivity:**  The first screen the user sees.  This will have a list of specimens, and an option to enter a new specimen.  

**SpecimenDetailsActivity:**  A screen that shows details of a specimen.  

**RetrofitInstance:** Boostrap class required for Retrofit.  

**Plant:** Noun class that represents a plant.  

**Specimen:** Noun class that represents a specimen.  

**IPlantDAO:** Interface for Retrofit to find and parse Plant JSON.  

**ISpecimenDAO:** Interface for Room to persist Specimen data  

## Scrum Roles

- DevOps/Product Owner/Scrum Master: Brandan Jones  
- Frontend Developer: Brandan Jones  
- Integration Developer: Brandan Jones  

## Weekly Meeting

Sunday at 7 PM.  Use this WebEx:

Meeting Information
[Office Hours WebEx](https://ucincinnati.webex.com/ucincinnati/j.php?MTID=m4eae59003bb943cc093fcd3f287864db)
Meeting number:
616 881 859







