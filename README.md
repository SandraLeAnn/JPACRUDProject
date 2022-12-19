<!-- PROJECT LOGO -->
# JPACRUDProject
<!-- TABLE OF CONTENTS -->

<details>
  <summary>Table of Contents</summary>
  <ul>
    <li>
      <a href="#about-the-project">About JPACRUD Project</a>
  </ul>
      <ul>
        <li><a href="#technologies-used">Technologies Used</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ul>
  <ul>
  <li><a href="#how-it-works">How It Works</li>
  </ul>
  <ul>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
    </ul>

</details>

<!-- ABOUT THE PROJECT -->

## About JPACRUD Project


<p>
 This project allows the user to perform basic crud operations within a database that I created. My database is based on fly fishing spots within the state of Wyoming. The user can search a fishing spot based on an id. Once at the spot result page, the user can choose to update or delete the spot. The update option redirects the user to a page that displays a form to update the searched fishing spot. The delete option will take the user to a page that tells them that the spot was successfully deleted. I wanted to keep the create a spot option on the homepage because this allows the user to add a new fishing spot to the database and creates a new id for that spot.
 </p>



<p align="right">(<a href="#top">back to top</a>)</p>

### Technologies Used

-   [Eclipse](https://spring.io/tools)
-   [Atom Text Editor](https://atom.io/)
-   [Java](https://www.java.com/en/)
-   [GITHUB](https://github.com)
-   [Debugger-Oracle](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/jdb.html)  
- JPQL
- MYSQL Database
- Spring boot
- JPA
- JSP pages
- HTML 5
- CSS
- Bootstrap


<p align="right">(<a href="#top">back to top</a>)</p>

## How It works
<p>
When a customer is presented with my home jsp they are given a couple options. Depending on the option, the user will request to GET info or POST info to and from the database.
If they decide to find a spot by id the user will enter an input in the form, specifically a number.
When the form is submitted, it will use an "action"(in this case, "findById.do") and a "GET" method to find the correct method call to use within the controller.

Inside that specific api method, it take the user input as a parameter(if there is one, like searchById requires an int parameter) and it will call the correct implementation method, within the spring boot side of the project, to access the specific information the user wants from the database.

Within the correct implementation, there will hold logic to complete the request by the user on the front end.
In this case, once the controller is found, the search by id GET request is this taken to the "findById" method within the impl.
This specific method, will take an int, and use the entity manager to find the specific java object that we are looking for, that MUST match the ID that the user sent to the back end, in order to get the correct object with that ID from the database.

I used a Model and View in order to store the object in the "Model" and also set the "View" to send the info that was received from the database back to the front end on a different JSP.

In this example, after the data is received from the DB, the controller that was used, sets a different view to display the results on a separate page.

Each type of action that the user would like to do, whether is is Create, Read, Update or Delete, has its own corresponding controller, dao and impl, in order to communicate, GET and POST info to the db.


</p>
<p align="right">(<a href="#top">back to top</a>)</p>

## What I Learned
<p>
I solidified my understanding of jpql and mysql database. This project helped clarify the path that a program takes for the front to the back and back to the front using api method calls and specific implementation logic to process the request coming from the front end. I noticed I need to work on understanding html tags, implementing css styling and how information to actually be displayed. I decided not to jump into styling with this project do to complications with project setup and css.  
</p>



## Contact

<strong>Developer on Project</strong>

<h4>Sandra Harpole</h4>
<ul>
<li>
<a href="https://www.linkedin.com/in/sandra-harpole/">
LinkedIn
</a>
</li>
<li><a href="https://github.com/SandraLeAnn">Github</a></li>
<li> E-mail: sharpnw21@gmail.com </li>
</ul>


Project Link: [JPACRUDProject](https://github.com/SandraLeAnn/JPACRUDProject)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->

## Acknowledgments


-   [Stack Overflow](https://stackoverflow.com/)
-   [W3 Schools](https://www.w3schools.com/)
-   [Google](https://www.google.com/)
<p align="right">(<a href="#top">back to top</a>)</p>
