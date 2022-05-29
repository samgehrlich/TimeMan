# TimeMan
---

Design Document  

## Introduction 

Do you want an app to help you plan your time? TimeMan can help you with it's various new time saving and planning features

-	Personalized profile for users.
-	Tasks and events based on the profile.
-	User can add thier own tasks and todo lists that can be saved and repeated as seprate elements to save time.
-	Seamless implementation with other softwares such as Canvas/Email and other tools.  

Use your Android device to create your own calendar and plans. Create a personalized profile that caters to your time needs. Create reminders and tasks based on what you did in past saving you time. Receive alerts about upcoming tasks and plans. 

## Storyboard


![TimeManFirstScreen](https://user-images.githubusercontent.com/57459468/170843101-61091905-6c12-456b-8b03-c36e76bf0b71.png)


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

As a user who wants to plan out his day, I want to quickly open up this app and look at my schedule to see what all tasks I have planned for the day.

#### Dependencies
Task data is available to the user.  
The devidce has a in-built calender app.  


#### Assumptions  
_______ 

#### Examples  

1.1  
**Given** user's calender data is available  
**When** User opens timeman calender page
**Then** user can see all his tasks for the day

2.1  
**Given** user's calender data is available  
**When**  user opens the calender page of the app 

-	Selects create task  
**Then** User can enter  tasks into the calender, the task option will also include previous tasks for faster input.

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

- DevOps/Product Owner/Scrum Master: Rishabh Sharma 
- Frontend Developer: Felix Odogwu  
- Integration Developer: Dhruman Patel  
- Developer:Robert Champion

## Weekly Meeting

Saturday 4 PM.  Use this WebEx:

Meeting Information
[Weekly meeting](https://ucincinnati.webex.com/ucincinnati/j.php?MTID=m4eae59003bb943cc093fcd3f285864db)
Meeting number:
514 245 679







