package net.applest.ane
{
	import flash.external.ExtensionContext;
	
	public class UriIntenter
	{
		private var context:ExtensionContext;
		
		public function UriIntenter()
		{
			context = ExtensionContext.createExtensionContext("net.applest.ane.extension.UriIntenter", null);
		}
		
		public function open(uri:String):UriIntenter
		{
			context.call("open", uri);
			return this;
		}
		
		public function dispose():void
		{
			context.dispose();
		}

	}
}