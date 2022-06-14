<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Index</title>
        <style type="text/css">
          form b {
            font-weight: 100;
            color: red;
            text-transform: capitalize;
          }
          .row {
              overflow: hidden;
              padding: 10px;
          }
          .col {
              float: left;
              width: 34%;
              padding-top: 12px;
          }
        </style>
    </head>
    <body>
        <h1>Workfall - Candidate's Form</h1>
        <#if user?? && noErrors??>
          <div>
            <h5 style="font-weight: 100 !important;">
              <span>Thank you, <strong>${user.firstName}</strong> for reaching out to us. Our team will get back to you at the earliest.</span>
              <span>Meanwhile, you can learn more about Workfall by clicking on this <a target="_blank" href="https://www.workfall.com/">link</a>.</span>
            </h5>
          </div>
        <#else>
            <form action="/form" method="post">
              <div class="row">
                  <div class="col">
                      <label>First Name:</label><br />
                      <@spring.formInput "user.firstName"/> <@spring.showErrors "<br />"/>
                  </div>
                  <div class="col">
                      <label>Last Name:</label><br />
                      <@spring.formInput "user.lastName"/> <@spring.showErrors "<br />"/>
                  </div>
                  <div class="col">
                      <label>Email:</label><br />
                      <@spring.formInput "user.email"/> <@spring.showErrors "<br />"/>
                  </div>
                  <div class="col">
                      <label>Phone:</label><br />
                      <@spring.formInput "user.phone"/> <@spring.showErrors "<br />"/>
                  </div>
                  <div class="col">
                      <label>Gender:</label><br />
                      <select>
                        <#list genders! as gender>
                          <option value="${gender}">${gender}</option>
                        </#list>
                      </select>
                  </div>
                  <div class="col">
                      <label>Date Of Birth:</label><br>
                      <@spring.formInput "user.birthdate"/> <@spring.showErrors "<br>"/>
                  </div>
              </div>
              <input type="submit" value="Submit">
            </form>
        </#if>
    </body>
</html>
