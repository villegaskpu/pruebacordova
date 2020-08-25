var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'pruebacordova', 'coolMethod', [arg0]);
};

module.exports.add = function (arg0,success,error)
{
    exec(success, error, 'pruebacordova', 'add', [arg0])
}

module.exports.substrac = function (arg0,success,error)
{
    exec(success, error, 'pruebacordova', 'substrac', [arg0])
}