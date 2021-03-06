/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

define(['model/listaProfesoresModel'], function() {
//Aqu� se define la estructura de un �tem de la lista. Note que el modelo extiende el modelo est�ndar backbone.
    App.Model.ListaProfesoresModel = Backbone.Model.extend({
        defaults: {
         'name' : '',
         'cupos' : ''
        },
        getDisplay: function(name) {
         return this.get(name);
        }
        });
//Aqu� se define el modelo de la lista. El modelo de la lista extiende de Backbone.Collection. En el atributo �model� se define el modelo  (definido arriba) que corresponde al molde de cada uno de los �tems de la lista.
    App.Model.ListaProfesoresList = Backbone.Collection.extend({
        model: App.Model.ListaProfesoresModel
    });
    return  App.Model.ListaProfesoresModel;
});

