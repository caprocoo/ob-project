<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Agency - Start Bootstrap Theme</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico"/>
    <!-- Font Awesome icons (free version)-->
    <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
    <!-- Google fonts-->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/styles.css?after" rel="stylesheet" type="text/css"/>


</head>
<body id="page-top" data-sb-form-api-token="API_TOKEN">
<%@include file="common/navbar.jsp" %>
<!-- Masthead-->
<header class="masthead">
    <div class="container">
        <div class="masthead-subheading">Welcome To Our Studio!</div>
        <div class="masthead-heading text-uppercase">It's Nice To Meet You</div>
        <a class="btn btn-primary btn-xl text-uppercase" href="#services" style="">Tell Me More</a>
    </div>
</header>
<!-- Services-->
<section class="page-section" id="services">
    <div class="container">
        <div class="text-center">
            <h2 class="section-heading text-uppercase">Services</h2>
            <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
        </div>
        <div class="row text-center">
            <div class="col-md-4">
                        <span class="fa-stack fa-4x">
                            <i class="fas fa-circle fa-stack-2x text-primary"></i>
                            <i class="fas fa-shopping-cart fa-stack-1x fa-inverse"></i>
                        </span>
                <h4 class="my-3">E-Commerce</h4>
                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam
                    architecto quo inventore harum ex magni, dicta impedit.</p>
            </div>
            <div class="col-md-4">
                        <span class="fa-stack fa-4x">
                            <i class="fas fa-circle fa-stack-2x text-primary"></i>
                            <i class="fas fa-laptop fa-stack-1x fa-inverse"></i>
                        </span>
                <h4 class="my-3">Responsive Design</h4>
                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam
                    architecto quo inventore harum ex magni, dicta impedit.</p>
            </div>
            <div class="col-md-4">
                        <span class="fa-stack fa-4x">
                            <i class="fas fa-circle fa-stack-2x text-primary"></i>
                            <i class="fas fa-lock fa-stack-1x fa-inverse"></i>
                        </span>
                <h4 class="my-3">Web Security</h4>
                <p class="text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam
                    architecto quo inventore harum ex magni, dicta impedit.</p>
            </div>
        </div>
    </div>
</section>

<!-- Team-->
<section class="page-section bg-light" id="team">
    <div class="container">
        <div class="text-center">
            <h2 class="section-heading text-uppercase">Our Amazing Team</h2>
            <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>
        </div>

        <div class="row" style="justify-content: center;">
            <div class="col-lg-4">
                <div class="team-account">
                    <img class="mx-auto rounded-circle" src="assets/img/team/1.jpg" alt="..."/>
                    <h4>Parveen Anand</h4>
                    <p class="text-muted">Lead Designer</p>
                    <a class="btn btn-dark btn-social mx-2" href="#!" aria-label="Parveen Anand Twitter Profile"><i
                            class="fab fa-twitter"></i></a>
                    <a class="btn btn-dark btn-social mx-2" href="#!" aria-label="Parveen Anand Facebook Profile"><i
                            class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-dark btn-social mx-2" href="#!" aria-label="Parveen Anand LinkedIn Profile"><i
                            class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
            <div class="col-lg-4" style="width: 50px; text-align: center;  line-height: 250px">
                <i class="fa-solid fa-heart" style="color: #8f59bf; font-size: 2em; " ></i>
            </div>
            <div class="col-lg-4">
                <div class="team-account">
                    <img class="mx-auto rounded-circle" src="assets/img/team/2.jpg" alt="..."/>
                    <h4>Diana Petersen</h4>
                    <p class="text-muted">Lead Marketer</p>
                    <a class="btn btn-dark btn-social mx-2" href="#!" aria-label="Diana Petersen Twitter Profile"><i
                            class="fab fa-twitter"></i></a>
                    <a class="btn btn-dark btn-social mx-2" href="#!"
                       aria-label="Diana Petersen Facebook Profile"><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-dark btn-social mx-2" href="#!"
                       aria-label="Diana Petersen LinkedIn Profile"><i class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-8 mx-auto text-center"><p class="large text-muted">Lorem ipsum dolor sit amet,
                consectetur adipisicing elit. Aut eaque, laboriosam veritatis, quos non quis ad perspiciatis, totam
                corporis ea, alias ut unde.</p></div>
        </div>
    </div>
</section>
<%--<!-- Clients-->--%>
<%--<div class="py-5">--%>
<%--    <div class="container">--%>
<%--        <div class="row align-items-center">--%>
<%--            <div class="col-md-3 col-sm-6 my-3">--%>
<%--                <a href="#!"><img class="img-fluid img-brand d-block mx-auto" src="assets/img/logos/microsoft.svg"--%>
<%--                                  alt="..." aria-label="Microsoft Logo"/></a>--%>
<%--            </div>--%>
<%--            <div class="col-md-3 col-sm-6 my-3">--%>
<%--                <a href="#!"><img class="img-fluid img-brand d-block mx-auto" src="assets/img/logos/google.svg"--%>
<%--                                  alt="..." aria-label="Google Logo"/></a>--%>
<%--            </div>--%>
<%--            <div class="col-md-3 col-sm-6 my-3">--%>
<%--                <a href="#!"><img class="img-fluid img-brand d-block mx-auto" src="assets/img/logos/facebook.svg"--%>
<%--                                  alt="..." aria-label="Facebook Logo"/></a>--%>
<%--            </div>--%>
<%--            <div class="col-md-3 col-sm-6 my-3">--%>
<%--                <a href="#!"><img class="img-fluid img-brand d-block mx-auto" src="assets/img/logos/ibm.svg" alt="..."--%>
<%--                                  aria-label="IBM Logo"/></a>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<!-- Contact-->--%>
<%--<section class="page-section" id="contact">--%>
<%--    <div class="container">--%>
<%--        <div class="text-center">--%>
<%--            <h2 class="section-heading text-uppercase">Contact Us</h2>--%>
<%--            <h3 class="section-subheading text-muted">Lorem ipsum dolor sit amet consectetur.</h3>--%>
<%--        </div>--%>
<%--        <!-- * * * * * * * * * * * * * * *-->--%>
<%--        <!-- * * SB Forms Contact Form * *-->--%>
<%--        <!-- * * * * * * * * * * * * * * *-->--%>
<%--        <!-- This form is pre-integrated with SB Forms.-->--%>
<%--        <!-- To make this form functional, sign up at-->--%>
<%--        <!-- https://startbootstrap.com/solution/contact-forms-->--%>
<%--        <!-- to get an API token!-->--%>
<%--        <form id="contactForm" data-sb-form-api-token="API_TOKEN">--%>
<%--            <div class="row align-items-stretch mb-5">--%>
<%--                <div class="col-md-6">--%>
<%--                    <div class="form-group">--%>
<%--                        <!-- Name input-->--%>
<%--                        <input class="form-control" id="name" type="text" placeholder="Your Name *"--%>
<%--                               data-sb-validations="required"/>--%>
<%--                        <div class="invalid-feedback" data-sb-feedback="name:required">A name is required.</div>--%>
<%--                    </div>--%>
<%--                    <div class="form-group">--%>
<%--                        <!-- Email address input-->--%>
<%--                        <input class="form-control" id="email" type="email" placeholder="Your Email *"--%>
<%--                               data-sb-validations="required,email"/>--%>
<%--                        <div class="invalid-feedback" data-sb-feedback="email:required">An email is required.</div>--%>
<%--                        <div class="invalid-feedback" data-sb-feedback="email:email">Email is not valid.</div>--%>
<%--                    </div>--%>
<%--                    <div class="form-group mb-md-0">--%>
<%--                        <!-- Phone number input-->--%>
<%--                        <input class="form-control" id="phone" type="tel" placeholder="Your Phone *"--%>
<%--                               data-sb-validations="required"/>--%>
<%--                        <div class="invalid-feedback" data-sb-feedback="phone:required">A phone number is required.--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <div class="col-md-6">--%>
<%--                    <div class="form-group form-group-textarea mb-md-0">--%>
<%--                        <!-- Message input-->--%>
<%--                        <textarea class="form-control" id="message" placeholder="Your Message *"--%>
<%--                                  data-sb-validations="required"></textarea>--%>
<%--                        <div class="invalid-feedback" data-sb-feedback="message:required">A message is required.</div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <!-- Submit success message-->--%>
<%--            <!---->--%>
<%--            <!-- This is what your users will see when the form-->--%>
<%--            <!-- has successfully submitted-->--%>
<%--            <div class="d-none" id="submitSuccessMessage">--%>
<%--                <div class="text-center text-white mb-3">--%>
<%--                    <div class="fw-bolder">Form submission successful!</div>--%>
<%--                    To activate this form, sign up at--%>
<%--                    <br/>--%>
<%--                    <a href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <!-- Submit error message-->--%>
<%--            <!---->--%>
<%--            <!-- This is what your users will see when there is-->--%>
<%--            <!-- an error submitting the form-->--%>
<%--            <div class="d-none" id="submitErrorMessage">--%>
<%--                <div class="text-center text-danger mb-3">Error sending message!</div>--%>
<%--            </div>--%>
<%--            <!-- Submit Button-->--%>
<%--            <div class="text-center">--%>
<%--                <button class="btn btn-primary btn-xl text-uppercase disabled" id="submitButton" type="submit">Send--%>
<%--                    Message--%>
<%--                </button>--%>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</section>--%>
<%@ include file="common/footer.jsp" %>


<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="js/scripts.js"></script>
<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
<!-- * *                               SB Forms JS                               * *-->
<!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->
<!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->
<script src="https://cdn.startbootstrap.com/sb-forms-latest.js"></script>
</body>
</html>
