import { tsThisType } from '@babel/types';
import React from 'react';
import { StyleSheet, Text, View, Button, TextInput, Dimensions, LogBox} from 'react-native';
import Tts from 'react-native-tts';

var height = Dimensions.get('window').height;
var width = Dimensions.get('window').width;

LogBox.ignoreAllLogs();

class App extends React.Component {
  constructor(){
    super();
    this.state = {
      setNewText:'',
    }
    this.textHandler = this.textHandler.bind(this);
     this.speakHandler = this.speakHandler.bind(this);
  }

  textHandler = (newText) => {
    this.setState({ setNewText: newText })
  }

   speakHandler = () => {
      Tts.speak(this.state.setNewText)
   }

  render() {
    return (
      <View style={styles.mainView}>
        <Text style={{marginBottom:20}}>speak App</Text>
        <TextInput
          placeholder='enter your text here'
          style={styles.myText}
          onChangeText={(text) => {this.textHandler(text)}}
        />
        <Text style={{marginBottom:40,}}>hello : {this.state.setNewText}</Text>
        <Button
          title = 'speak'
          onPress={this.speakHandler}
        />
      </View>
    );
  }
};

const styles = StyleSheet.create({
  mainView:{
    flex:1,
    alignItems:'center',
    justifyContent:'center',
  },
  myText:{
    height:height/15,
    width:width/1.5,
    borderColor:'blue',
    borderTopRightRadius:10,
    borderBottomLeftRadius:10,
    borderWidth:1,
    paddingLeft:width/6,
    paddingRight:width/6,
    marginBottom:30,
  },
});

export default App;
