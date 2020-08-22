# Task1

1. [ Galery App ](#Task)
2. [About Galery App](#About) 
   * [How it works?](#How)
   * [Tools](#Tools)
   * [ Screenshots ](#Screenshots)
   * [ Video Review ](#Video) 

<a name="Task"></a>
## 1. Galery App 

It is a simple gallery application. The design of the main screen of the gallery application has been requested to be similar to the given design.

**Given Design:** 

<img src="https://user-images.githubusercontent.com/36292743/90950324-267e4400-e405-11ea-9001-1b386a0a06e9.jpeg" width="200" height="400">

<a name="About"></a>
## About Galery App

I tried to make the gallery application as desired. The application consists of 3 pages. The main page with the albums, the page with the photos when clicking on the albums, and the page when clicking the photos.

<a name="How"></a>
### How it works?
The Galery App application is a simple application. When the application is first opened, the home page appears. There are several albums on the homepage. There is a toolbar option in the upper right corner. When one of the albums is clicked, the page with the photos of that album opens. On this page, there are a few photos. Clicking on any of the photos opens the selected photo.

<a name="Tools"></a>
### Tools
**The layouts & views used in the application:**
* Linear Layout
* Grid Layout
* Scroll View
* Image View
* Text View
* Grid View
* Toolbar

**Used when implementing the application:**
* AdapterView, adapter (listing image)
* Intent, getIntent (open a new activity, get text & image)
* onClickListener
* setOnMenuItemClickListener
* onCreateOptionsMenu

<a name="Screenshots"></a>
### Screenshots

The first 3 images below are on the main page. Pictures 1 and 2 show the albums on the homepage. In the third picture, the toolbar is shown. The 4th picture below is the page showing the pictures after the album is selected. Pictures 5 and 6 are the page shown after any photo is selected.

<p align="center">
  <img src="https://user-images.githubusercontent.com/36292743/90871802-81a22f00-e350-11ea-8f5e-8cd5b0337d1b.jpeg" width="200" height="400">  <img src="https://user-images.githubusercontent.com/36292743/90871783-77803080-e350-11ea-8781-4ee7bcd3b01f.jpeg" width="200" height="400">  <img src="https://user-images.githubusercontent.com/36292743/90871746-67685100-e350-11ea-897a-aea34346cc76.jpeg" width="200" height="400">
</p>
<p align="center">
  Main page &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp  &nbsp &nbsp  &nbsp &nbsp Main Page &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp  Main Page Menu Bar
</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/36292743/90871593-2c661d80-e350-11ea-9eb6-02f66981acfe.jpeg" width="200" height="400">  <img src="https://user-images.githubusercontent.com/36292743/90871551-1b1d1100-e350-11ea-8e95-4c36f6d9647f.jpeg" width="200" height="400">  <img src="https://user-images.githubusercontent.com/36292743/90871830-8bc42d80-e350-11ea-8b50-4808b55c5e87.jpeg" width="200" height="400">
</p>
<p align="center">
  Selected album page  &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp Selected Photo Page &nbsp &nbsp &nbsp  &nbsp &nbsp Selected Photo Page
</p>


<a name="Video"></a>
### Video Review
<p align="center">
  <img src="https://user-images.githubusercontent.com/36292743/90950908-d30ef480-e40a-11ea-916b-ebd30e7b109e.gif" alt="animated" />
</p>


**Hint!** While I was making the application, I did not fork from any of the github repos. Because, since the new version of the android studio application has been released (AndroidX), it gets a lot of errors while running low version applications.



